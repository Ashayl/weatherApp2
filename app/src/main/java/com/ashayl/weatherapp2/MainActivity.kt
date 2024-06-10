package com.ashayl.weatherapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMain: button = findViewById<>(R.id.buttonMain)
        buttonMain.setOnClickListener {
            val intent=Intent(this, MainScreenActivity:: class.java)
            startActivity(intent)
        }
        val buttonExit: button = findViewById<>(R.Id.buttonExit
            buttonExit.setOnClickListener{

                exitProcess(0)
        }
    }
}