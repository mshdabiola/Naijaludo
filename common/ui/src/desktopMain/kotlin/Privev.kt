//import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import org.xml.sax.InputSource
import java.io.ByteArrayInputStream

//@Preview
@Composable
fun Preview() {
    val data = """
        <vector xmlns:android="http://schemas.android.com/apk/res/android"
            android:width="140.99dp"
            android:height="114.53dp"
            android:viewportWidth="140.99"
            android:viewportHeight="114.53">
            <path
                android:fillColor="#547ec0"
                android:pathData="M117.26,98C107.12,107 95,111.8 81.81,113.69c-21.65,3.11 -41.18,-2.48 -58.37,-16.06a21.54,21.54 0,0 1,-2.33 -2.52c-1.5,-3.46 0.76,-6.08 2.2,-8.72 3,-5.59 8,-9.21 13.49,-12.15 1.55,-0.84 3.34,-1.77 5,0.07C43.51,80 47.52,81.7 53.2,81.56c10.77,-0.27 21.55,-0.22 32.32,0 5.5,0.11 9.36,-1.62 10.88,-7.21 1,-1.33 2.29,-1.21 3.54,-0.71 9.12,3.64 15.38,9.93 18,19.57A6.85,6.85 0,0 1,117.26 98Z" />
            <path
                android:fillColor="#547ec0"
                android:pathData="M128.14,25.1h0a34.34,34.34 0,0 0,-4.64 -6.25C111.22,6.79 96.12,1.72 79.3,0.8A5.34,5.34 0,0 0,77.54 0.05C64.06,-0.23 50.76,0.51 38,5.66 27.47,9.9 18.05,15.36 12.51,25.83c-3.64,-2.49 -6.39,0 -8.72,2.07A11,11 0,0 0,0.36 39.15c1.46,6.22 7,9.66 12.12,7.66h0c1.27,3.12 3.53,5.54 5.69,8C24.84,61.68 33.47,65.14 42,68.76a3.35,3.35 0,0 0,1.86 1.58,88.67 88.67,0 0,0 32.41,3.8 3.09,3.09 0,0 0,2.42 -1l0.74,0.12c6.19,-0.09 12.32,-0.41 17.62,-4.22 9.46,-3.24 18.45,-7.31 25.79,-14.35l5.27,-7.05h0c7.77,0.27 13,-4.6 12.87,-12C140.87,29.25 135.35,24.7 128.14,25.1ZM118.38,42c-3.57,4 -8.25,6.06 -13.21,7.67C84.67,56.33 63.93,55.9 43.06,52c-2.24,-0.42 -4.46,-1.6 -6.79,-0.37 0,0.11 0,0.21 0,0.31l-0.14,-0.19c-0.12,-1.86 -1.85,-1.91 -3,-2.65a29.08,29.08 0,0 1,-9.75 -5.88c-5.16,-4.81 -5.16,-9.76 0.28,-14.38a26.44,26.44 0,0 1,9.58 -5.19c2.15,-1.29 5,-1.33 6.6,-3.57 0.13,0.13 0.25,0.25 0.4,0.38 1.64,0.73 3.27,0.3 4.89,-0.08 18.53,-4.37 37,-3.5 55.31,1.06 6.66,1.65 13,4.09 17.89,9.31C122.13,34.77 122.15,37.83 118.38,42Z" />
            <path
                android:fillColor="#428ecc"
                android:pathData="M42,68.76c10.93,2.73 22,4.5 33.29,3.85 1.27,-0.07 2.67,0.42 3.78,-0.65 6.18,0.26 12,-1.85 18,-2.87 0.1,1.65 0.19,3.29 0.29,4.93 -0.53,6.6 -2.8,8.84 -9.29,8.87q-18.86,0.08 -37.72,0c-6.4,0 -8.8,-2.29 -9.5,-8.78C41.37,72.36 40.38,70.28 42,68.76Z" />
            <path
                android:fillColor="#428ecc"
                android:pathData="M113.13,24.86c-12,-6.49 -25.26,-7.85 -38.55,-8.57C62.92,15.66 51.41,17.34 40,19.78l-7,2.85h0c-3.86,0.67 -7.08,2.76 -10,5.15 -6.6,5.49 -6.49,11.46 0.1,16.91 2.91,2.41 6,4.67 9.92,5.2h0l3.07,1.81C51.3,56 66.86,56.91 82.53,55.78 93,55 103.25,52.86 112.71,48c5,-2.54 10.07,-5.65 10,-12C122.59,30.28 117.74,27.35 113.13,24.86ZM50.12,44a11.3,11.3 0,0 1,-15.26 1.7A31.87,31.87 0,0 1,31 41.92c-0.39,-2.35 -0.77,-4.7 -1.16,-7.05 1,-5.24 4.13,-8.69 9.28,-9.86a10.92,10.92 0,0 1,10.77 3.6A11.52,11.52 0,0 1,50.12 44ZM77.84,47.7c-2.58,2.17 -5.45,3.66 -8.49,3.32a11.73,11.73 0,0 1,-8.92 -3.42,1.56 1.56,0 0,1 -0.27,-2.22c0.73,-0.89 1.46,-0.4 2.1,0.13 4.66,3.78 9.29,3.58 13.9,-0.09 0.74,-0.59 1.41,-0.73 2.07,0.12A1.47,1.47 0,0 1,77.84 47.7ZM97.61,47.92a11.54,11.54 0,0 1,-0.26 -23.07,11.73 11.73,0 0,1 11.74,11.63A11.81,11.81 0,0 1,97.61 47.92Z" />
            <path
                android:fillColor="#009fe3"
                android:pathData="M45.07,36.49c-0.32,2.3 -1.51,3.61 -3.93,3.49s-3.49,-1.79 -3.31,-4a3.23,3.23 0,0 1,3.63 -3.22C43.87,32.84 45,34.12 45.07,36.49Z" />
            <path
                android:fillColor="#009fe3"
                android:pathData="M98.32,39.93c-3.16,0.19 -4.41,-1.21 -4.47,-3.48 -0.06,-2 0.88,-3.52 3.15,-3.66s3.89,0.79 4,3.24S100.09,39.78 98.32,39.93Z" />
        </vector>
    """.trimIndent()
    val density = LocalDensity.current
    val f = ByteArrayInputStream(data.toByteArray()).buffered().use {
        loadXmlImageVector2(InputSource(it), density)
    }
    Image(f, "")

}