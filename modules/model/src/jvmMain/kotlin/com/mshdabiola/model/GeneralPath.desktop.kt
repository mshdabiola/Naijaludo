package com.mshdabiola.model

actual val generalPath: String
    get() = System.getProperty("java.io.tmpdir") + "/ludo" // "${System.getProperty("user.home")}/AppData/Local/hydraulic"
