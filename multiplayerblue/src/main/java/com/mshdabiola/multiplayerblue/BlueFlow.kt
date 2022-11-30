package com.mshdabiola.multiplayerblue

import android.annotation.SuppressLint
import android.app.Activity
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.bluetooth.BluetoothProfile
import android.bluetooth.BluetoothServerSocket
import android.bluetooth.BluetoothSocket
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.location.LocationManager
import android.os.Parcelable
import android.text.TextUtils
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import java.io.IOException
import java.util.UUID
import javax.inject.Inject
import kotlin.Short.Companion.MIN_VALUE
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn

@SuppressLint("MissingPermission")
class BlueFlow @Inject constructor(
    @ApplicationContext private val context: Context
) {

    private val bluetoothManager = context
        .getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
    val bluetoothAdapter: BluetoothAdapter = bluetoothManager.adapter

    @Volatile
    var currentBluetoothSocket: BluetoothSocket? = null
    private var blueFlowIO: BlueFlowIO? = null

    /**
     * Return true if Bluetooth is available.
     *
     * @return true if bluetoothAdapter is not null or it's address is empty, otherwise Bluetooth is
     * not supported on this hardware platform
     */

    @SuppressLint("HardwareIds")
    fun isBluetoothAvailable() =
        !(bluetoothAdapter == null || TextUtils.isEmpty(bluetoothAdapter.address))

    /**
     * Return true if Bluetooth is currently enabled and ready for use.
     * <p>Equivalent to:
     * <code>getBluetoothState() == STATE_ON</code>
     * <p>Requires [android.Manifest.permission.BLUETOOTH]
     *
     * @return true if the local adapter is turned on
     */
    fun isBluetoothEnabled() = bluetoothAdapter.isEnabled

    /**
     * Return true if a location service is enabled.
     *
     * @return true if either the GPS or Network provider is enabled
     */
    fun isLocationServiceEnabled(): Boolean {
        val locationManager =
            context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
            locationManager.isProviderEnabled(
                LocationManager.NETWORK_PROVIDER
            )
    }

    /**
     * Get [BlueFlowIO] Helper class for simplifying read and write operations from/to {@link BluetoothSocket}.
     *
     * @param socket bluetooth socket
     * @returns BlueFlowIO
     */
    fun getIO(bluetoothSocket: BluetoothSocket): BlueFlowIO {

        if (blueFlowIO?.bluetoothSocket === bluetoothSocket) {
            return blueFlowIO as BlueFlowIO
        }

        currentBluetoothSocket = bluetoothSocket
        blueFlowIO = BlueFlowIO(bluetoothSocket)
        return blueFlowIO as BlueFlowIO
    }

    /**
     * Helper class for simplifying read and write operations from/to [BluetoothSocket].
     *
     * @returns BlueFlowIO or null
     */
    fun getIO(): BlueFlowIO? {

        return currentBluetoothSocket?.let { socket ->
            if (blueFlowIO?.bluetoothSocket === socket)
                return@let blueFlowIO
            blueFlowIO = BlueFlowIO(socket)
            return@let blueFlowIO
        }
    }

    /**
     * This will issue a request to enable Bluetooth through the system settings (without stopping
     * your application) via ACTION_REQUEST_ENABLE action Intent.
     *
     * @param activity Activity
     * @param requestCode request code
     */
    fun enableBluetooth(activity: Activity, requestCode: Int) {
        if (!bluetoothAdapter.isEnabled) {
            val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
            activity.startActivityForResult(enableBtIntent, requestCode)
        }
    }

    /**
     * Turn on the local Bluetooth adapter — do not use without explicit user action to turn on
     * Bluetooth.
     *
     * @return true to indicate adapter startup has begun, or false on
     * immediate error
     * @see BluetoothAdapter.enable
     */

    fun enable() = bluetoothAdapter.enable()

    /**
     * Turn off the local Bluetooth adapter — do not use without explicit user action to turn off
     * Bluetooth.
     *
     * @return true to indicate adapter shutdown has begun, or false on
     * immediate error
     * @see BluetoothAdapter.enable
     */

    fun disable() = bluetoothAdapter.disable()

    /**
     * Return the set of [BluetoothDevice] objects that are bonded
     * (paired) to the local adapter.
     *
     * If Bluetooth state is not [BluetoothAdapter.STATE_ON], this API
     * will return an empty set. After turning on Bluetooth,
     * wait for [BluetoothAdapter.ACTION_STATE_CHANGED] with [BluetoothAdapter.STATE_ON]
     * to get the updated value.
     *
     * Requires [android.Manifest.permission.BLUETOOTH].
     *
     * @return unmodifiable set of [BluetoothDevice], or null on error
     */
    @SuppressLint("MissingPermission")
    fun bondedDevices(): Set<BluetoothDevice>? = bluetoothAdapter.bondedDevices

    /**
     * Start the remote device discovery process.
     *
     * @return true on success, false on error
     */
    @SuppressLint("MissingPermission")
    fun startDiscovery() = bluetoothAdapter.startDiscovery()

    /**
     * Return true if the local Bluetooth adapter is currently in the device
     * discovery process.
     *
     * @return true if discovering
     */
    @SuppressLint("MissingPermission")
    fun isDiscovering() = bluetoothAdapter.isDiscovering

    /**
     * Cancel the current device discovery process.
     *
     * @return true on success, false on error
     */
    @SuppressLint("MissingPermission")
    fun cancelDiscovery() = bluetoothAdapter.cancelDiscovery()

    /**
     * This will issue a request to make the local device discoverable to other devices. By default,
     * the device will become discoverable for 120 seconds.
     *
     * @param activity Activity
     * @param requestCode request code
     */
    fun enableDiscoverability(activity: Activity, requestCode: Int) {
        enableDiscoverability(activity, requestCode, -1)
    }

    /**
     * This will issue a request to make the local device discoverable to other devices. By default,
     * the device will become discoverable for 120 seconds.  Maximum duration is capped at 300
     * seconds.
     *
     * @param activity Activity
     * @param requestCode request code
     * @param duration discoverability duration in seconds
     */
    @SuppressLint("MissingPermission")
    fun enableDiscoverability(activity: Activity, requestCode: Int, duration: Int) {
        val discoverableIntent = Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE)
        if (duration >= 0) {
            discoverableIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, duration)
        }
        activity.startActivityForResult(discoverableIntent, requestCode)
    }

    /**
     * Observes Bluetooth devices found while discovering.
     *
     * @return Flow of [BluetoothDeviceWrapper] including [BluetoothDevice] and rssi
     */

    fun discoverDevices(): Flow<BluetoothDeviceWrapper> = callbackFlow<BluetoothDeviceWrapper> {
        val filter = IntentFilter(BluetoothDevice.ACTION_FOUND).apply {
            addAction(BluetoothAdapter.ACTION_DISCOVERY_STARTED)
            addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED)
        }
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                when (intent?.action) {
                    BluetoothDevice.ACTION_FOUND -> {
                        Log.i("BlueFlowLib", "FOUND DEVICE")
                        val device =
                            intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE)
                                as BluetoothDevice?
                        val rssi = intent
                            .getShortExtra(BluetoothDevice.EXTRA_RSSI, MIN_VALUE).toInt()
                        device?.let { trySend(BluetoothDeviceWrapper(it, rssi)).isSuccess }
                    }
                    BluetoothAdapter.ACTION_DISCOVERY_STARTED -> {
                        Log.i("BlueFlowLib", "DISCOVERY STARTED")
                    }
                    BluetoothAdapter.ACTION_DISCOVERY_FINISHED -> {
                        Log.i("BlueFlowLib", "DISCOVERY FINISHED")
                    }
                }
            }
        }
        context.registerReceiver(receiver, filter)

        awaitClose {
            context.unregisterReceiver(receiver)
        }
    }.flowOn(Dispatchers.IO)

    /**
     * Observes DiscoveryState, which can be ACTION_DISCOVERY_STARTED or ACTION_DISCOVERY_FINISHED
     * from [BluetoothAdapter].
     *
     * @return Flow Observable with DiscoveryState
     */
    @ExperimentalCoroutinesApi
    fun discoveryState(): Flow<String> = callbackFlow<String> {
        val filter = IntentFilter().apply {
            addAction(BluetoothAdapter.ACTION_DISCOVERY_STARTED)
            addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED)
        }
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                intent?.let { anIntent ->
                    anIntent.action?.let { action -> trySend(action).isSuccess }
                }
            }
        }
        context.registerReceiver(receiver, filter)
        awaitClose {
            context.unregisterReceiver(receiver)
        }
    }.flowOn(Dispatchers.IO)

    /**
     * Observes BluetoothState. Possible values are:
     *
     * [BluetoothAdapter.STATE_OFF],
     * [BluetoothAdapter.STATE_TURNING_ON],
     * [BluetoothAdapter.STATE_ON],
     * [BluetoothAdapter.STATE_TURNING_OFF],
     *
     * @return Flow Observable with BluetoothState
     */
    @ExperimentalCoroutinesApi
    fun bluetoothState(): Flow<Int> = callbackFlow<Int> {
        val filter = IntentFilter().apply {
            addAction(BluetoothAdapter.ACTION_STATE_CHANGED)
        }
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                trySend(bluetoothAdapter.state).isSuccess
            }
        }
        context.registerReceiver(receiver, filter)
        awaitClose {
            context.unregisterReceiver(receiver)
        }
    }.flowOn(Dispatchers.IO)

    /**
     * Observes scan mode of device. Possible values are:
     * [BluetoothAdapter.SCAN_MODE_NONE],
     * [BluetoothAdapter.SCAN_MODE_CONNECTABLE],
     * [BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE]
     *
     * @return Flow Observable with scan mode
     */
    @ExperimentalCoroutinesApi
    fun scanMode(): Flow<Int> = callbackFlow<Int> {
        val filter = IntentFilter().apply {
            addAction(BluetoothAdapter.ACTION_SCAN_MODE_CHANGED)
        }
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                trySend(bluetoothAdapter.scanMode).isSuccess
            }
        }
        context.registerReceiver(receiver, filter)
        awaitClose {
            context.unregisterReceiver(receiver)
        }
    }.flowOn(Dispatchers.IO)

    /**
     * Observes connection to specified profile. See also @see [BluetoothProfile.ServiceListener].
     *
     * @param bluetoothProfile bluetooth profile to connect to. Can be either [BluetoothProfile.HEALTH],
     * [BluetoothProfile.HEADSET], [BluetoothProfile.A2DP],
     * [BluetoothProfile.GATT] or [BluetoothProfile.GATT_SERVER].
     * @return Flow Observable with [ServiceEvent]
     */
    @ExperimentalCoroutinesApi
    fun bluetoothProfile(bluetoothProfile: Int): Flow<ServiceEvent> = callbackFlow<ServiceEvent> {

        val listener = object : BluetoothProfile.ServiceListener {
            var proxy: BluetoothProfile? = null
            override fun onServiceConnected(profile: Int, proxy: BluetoothProfile?) {
                this.proxy = proxy
                trySend(ServiceEvent(ServiceEvent.State.CONNECTED, profile, proxy)).isSuccess
            }

            override fun onServiceDisconnected(profile: Int) {
                trySend(
                    ServiceEvent(
                        ServiceEvent.State.DISCONNECTED,
                        profile, null
                    )
                ).isSuccess
            }
        }

        if (!bluetoothAdapter.getProfileProxy(context, listener, bluetoothProfile)) {
            throw ProfileProxyException()
        }
        awaitClose {
            listener.proxy?.let {
                bluetoothAdapter.closeProfileProxy(bluetoothProfile, it)
            }
        }
    }.flowOn(Dispatchers.IO)

    /**
     * Close the connection of the profile proxy to the Service.
     *
     *
     *  Clients should call this when they are no longer using the proxy
     *
     * Profile can be one of [BluetoothProfile.HEALTH], [BluetoothProfile.HEADSET],
     * [BluetoothProfile.A2DP], [BluetoothProfile.GATT] or [BluetoothProfile.GATT_SERVER].
     *
     * @param profile the Bluetooth profile
     * @param proxy profile proxy object
     */
    fun closeProfileProxy(profile: Int, proxy: BluetoothProfile) =
        bluetoothAdapter.closeProfileProxy(profile, proxy)

    /**
     * Observes connection state of devices.
     *
     * @return Flow Observable with {@link ConnectionStateEvent}
     */
    @ExperimentalCoroutinesApi
    fun connectionState(): Flow<ConnectionStateEvent> = callbackFlow<ConnectionStateEvent> {
        val filter = IntentFilter().apply {
            addAction(BluetoothAdapter.ACTION_CONNECTION_STATE_CHANGED)
        }
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                intent?.let {
                    val status = it.getIntExtra(
                        BluetoothAdapter.EXTRA_CONNECTION_STATE,
                        BluetoothAdapter.STATE_DISCONNECTED
                    )
                    val previousStatus = it.getIntExtra(
                        BluetoothAdapter.EXTRA_PREVIOUS_CONNECTION_STATE,
                        BluetoothAdapter.STATE_DISCONNECTED
                    )
                    val device =
                        it.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE) as? BluetoothDevice
                    trySend(ConnectionStateEvent(status, previousStatus, device)).isSuccess
                }
            }
        }
        context.registerReceiver(receiver, filter)
        awaitClose {
            context.unregisterReceiver(receiver)
        }
    }.flowOn(Dispatchers.IO)

    /**
     * Observes bond state of devices.
     *
     * @return Flow Observable with [BondStateEvent]
     */
    @ExperimentalCoroutinesApi
    fun bondState(): Flow<BondStateEvent> = callbackFlow<BondStateEvent> {
        val filter = IntentFilter().apply {
            addAction(BluetoothAdapter.ACTION_CONNECTION_STATE_CHANGED)
        }
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                intent?.let {
                    val state =
                        it.getIntExtra(BluetoothDevice.EXTRA_BOND_STATE, BluetoothDevice.BOND_NONE)
                    val previousState = it.getIntExtra(
                        BluetoothDevice.EXTRA_PREVIOUS_BOND_STATE,
                        BluetoothDevice.BOND_NONE
                    )
                    val device =
                        it.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE) as? BluetoothDevice
                    trySend(BondStateEvent(state, previousState, device)).isSuccess
                }
            }
        }
        context.registerReceiver(receiver, filter)
        awaitClose {
            context.unregisterReceiver(receiver)
        }
    }.flowOn(Dispatchers.IO)

    /**
     * Opens {@link BluetoothServerSocket}, listens for a single connection request, releases socket
     * and returns a connected {@link BluetoothSocket} on successful connection. Notifies observers
     * with {@link IOException} {@code onError()}.
     *
     * @param name service name for SDP record
     * @param uuid uuid for SDP record
     * @param secure connection security status
     * @return Single with connected {@link BluetoothSocket} on successful connection
     * @throws IOException when socket might closed or timeout, read ret: -1
     */

    suspend fun connectAsServerAsync(
        name: String,
        uuid: UUID,
        secure: Boolean = true
    ): Deferred<BluetoothSocket> =
        coroutineScope {
            return@coroutineScope async(Dispatchers.IO) {
                val bluetoothServerSocket: BluetoothServerSocket = if (secure)
                    bluetoothAdapter.listenUsingRfcommWithServiceRecord(name, uuid)
                else
                    bluetoothAdapter.listenUsingInsecureRfcommWithServiceRecord(name, uuid)
                bluetoothServerSocket.accept().also { currentBluetoothSocket = it }
            }
        }

    /**
     * Create connection to {@link BluetoothDevice} and returns a connected {@link BluetoothSocket}
     * on successful connection. Notifies observers with {@link IOException} via {@code onError()}.
     *
     * @param bluetoothDevice bluetooth device to connect
     * @param uuid uuid for SDP record
     * @param secure connection security status
     * @return Deferred with connected {@link BluetoothSocket} on successful connection
     * @throws IOException when socket might closed or timeout, read ret: -1
     */

    suspend fun connectAsClientAsync(
        bluetoothDevice: BluetoothDevice,
        uuid: UUID,
        secure: Boolean = true
    ): Deferred<BluetoothSocket> =
        coroutineScope {
            return@coroutineScope async(Dispatchers.IO) {
                val bluetoothSocket =
                    if (secure) bluetoothDevice.createRfcommSocketToServiceRecord(uuid)
                    else bluetoothDevice.createInsecureRfcommSocketToServiceRecord(uuid)
                bluetoothSocket.apply {
                    currentBluetoothSocket = this
                    connect()
                }
            }
        }

    /**
     * Create connection to {@link BluetoothDevice} via createRfcommSocket and returns a connected {@link BluetoothSocket}
     * on successful connection.
     * Note: createRfcommSocket is not public API and hence this might break in the future.
     * Notifies observers with {@link IOException} or any reflection related exception via {@code onError()}.
     *
     * @param bluetoothDevice bluetooth device to connect
     * @param channel RFCOMM channel to connect to
     * @return Deferred with connected {@link BluetoothSocket} on successful connection
     * @throws IOException when socket might closed or timeout, read ret: -1
     */

    suspend fun connectAsClientAsync(
        bluetoothDevice: BluetoothDevice,
        channel: Int
    ): Deferred<BluetoothSocket> = coroutineScope {
        return@coroutineScope async(Dispatchers.IO) {
            val bluetoothSocket = bluetoothDevice.createRfcommSocket(channel)
            bluetoothSocket.apply {
                currentBluetoothSocket = this
                connect()
            }
        }
    }

    /**
     * Observes ACL broadcast actions from {@link BluetoothDevice}. Possible broadcast ACL action
     * values are:
     * [BluetoothDevice.ACTION_ACL_CONNECTED],
     * [BluetoothDevice.ACTION_ACL_DISCONNECT_REQUESTED],
     * [BluetoothDevice.ACTION_ACL_DISCONNECTED]
     *
     * @return Flow Observable with {@link AclEvent}
     */
    @ExperimentalCoroutinesApi
    fun aclEvents(): Flow<AclEvent> = callbackFlow<AclEvent> {
        val filter = IntentFilter().apply {
            addAction(BluetoothDevice.ACTION_ACL_CONNECTED)
            addAction(BluetoothDevice.ACTION_ACL_DISCONNECTED)
            addAction(BluetoothDevice.ACTION_ACL_DISCONNECT_REQUESTED)
        }
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                intent?.let {
                    val device =
                        it.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE,) as? BluetoothDevice
                    trySend(AclEvent(it.action ?: "", device)).isSuccess
                }
            }
        }
        context.registerReceiver(receiver, filter)
        awaitClose {
            context.unregisterReceiver(receiver)
        }
    }.flowOn(Dispatchers.IO)

    /**
     * Performs a service discovery and fetches a list of UUIDs that can be used to connect to {@link BluetoothDevice}
     *
     * @param bluetoothDevice bluetooth device to connect
     * @return Flow Observable with an array of Device UUIDs that can be used to connect to the device
     */
    @ExperimentalCoroutinesApi
    fun fetchDeviceUuids(): Flow<List<Parcelable>> = callbackFlow<List<Parcelable>> {
        val filter = IntentFilter().apply {
            addAction(BluetoothDevice.ACTION_UUID)
        }
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                intent?.let { intnt ->
                    val uuidArray =
                        intnt
                            .getParcelableArrayExtra(BluetoothDevice.EXTRA_UUID)
                            as? Array<Parcelable>
                    uuidArray?.let { trySend(it.toList()).isSuccess }
                }
            }
        }

        context.registerReceiver(receiver, filter)
        awaitClose {
            context.unregisterReceiver(receiver)
        }
    }.flowOn(Dispatchers.IO)

    fun closeConnections() = blueFlowIO?.closeConnections()
}

val SERVICE_UUID = UUID.fromString("452782993")
