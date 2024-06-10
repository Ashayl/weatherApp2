package com.ashayl.detailedviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMS: Button = findViewById<Button>(R.id.buttonMS)
        val tvDetails = findViewById<TextView>(R.id.tvDetails)
        val displayData = intent.getStringExtra("DISPLAY_DATA")
        tvDetails.text = displayData


    }
}