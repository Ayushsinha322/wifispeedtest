package com.dangerx.wifispeedtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView



class WiFiSpeedResultActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_SPEED_RESULT = "extra_speed_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wifi_speed_result)

        val speedResult = intent.getStringExtra(EXTRA_SPEED_RESULT)
        val tvResult: TextView = findViewById(R.id.tvResult)
        tvResult.text = speedResult
    }
}
