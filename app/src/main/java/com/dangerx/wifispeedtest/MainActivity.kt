package com.dangerx.wifispeedtest

// MainActivity.kt
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnTestSpeed: Button
    private lateinit var tvSpeedResult: TextView
    private val speedTestManager = SpeedTestManager(this) { result ->
        // Update UI with the speed test result on the main thread
        runOnUiThread {
            tvSpeedResult.text = result
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTestSpeed = findViewById(R.id.btnTestSpeed)
        tvSpeedResult = findViewById(R.id.tvSpeedResult)

        btnTestSpeed.setOnClickListener {
            // Perform speed test using SpeedTestManager
            speedTestManager.performSpeedTest()
        }
    }
}
