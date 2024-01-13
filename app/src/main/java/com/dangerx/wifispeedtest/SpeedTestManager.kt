package com.dangerx.wifispeedtest


// SpeedTestManager.kt
import android.content.Context
import android.content.Intent
import com.dangerx.wifispeedtest.WiFiSpeedResultActivity.Companion.EXTRA_SPEED_RESULT

class SpeedTestManager(private val context: Context, private val callback: (String) -> Unit) {

    fun performSpeedTest() {
        // Simulate a network request to measure speed
        val startTime = System.currentTimeMillis()

        // Replace the following line with your actual network request logic
        // For demonstration, we'll simulate downloading 5 MB of data
        val simulatedDownloadTime = 3000 // Simulate 3 seconds download time
        val endTime = startTime + simulatedDownloadTime

        // Calculate the speed
        val dataSizeInBytes = 5 * 10 // 5 MB
        val speed = (dataSizeInBytes.toDouble() / (simulatedDownloadTime.toDouble() / 1000)).toInt()

        // Format the speed result
        val speedResult = "Speed: $speed Mbps"

        // Update UI on the main thread
        callback.invoke(speedResult)

        // Start the WiFiSpeedResultActivity with the result
        val intent = Intent(context, WiFiSpeedResultActivity::class.java).apply {
            putExtra(EXTRA_SPEED_RESULT, speedResult)
        }
        context.startActivity(intent)
    }
}
