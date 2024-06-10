package com.ashayl.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize them
        var i: Int = 0 // Stores number of entries in array
        var display: String = "" // Display blank first
        val maxEntries = 7 // Only allow 7 array entries

        var averageMin: Int = 0
        var averageMax: Int = 0
        var averageTotal: Int = 0
        var displayAverageWeather: String = ""

        // Create arrays
        val day = Array(maxEntries) { "" }
        val morningTime = Array(maxEntries) { 0 }
        val afternoonTime = Array(maxEntries) { 0 }
        val actNotes = Array(maxEntries) { "" }

        val buttonMore: Button = findViewById<Button>(R.id.buttonMore)
        val buttonExt: Button = findViewById<Button>(R.id.buttonExt)
        val buttonClear: button = findViewById<button>(R.id.buttonClear)

        buttonMore.setOnClickListener {
            // Check if there's enough entries
            if (i < maxEntries) {
                // Convert to display types
                day[i] = dateTv.text.toString()
                morningTime[i] =
                    MinTv.text.toString().toIntOrNull() ?: 0 // 0 is for error checking
                afternoonTime[i] =
                    maxTv.text.toString().toIntOrNull() ?: 0 // 0 is for error checking
                actNotes[i] = actNotes.text.toString()
                i++ // Increment entry number

                Toast.makeText(this, "Entry added", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Maximum entries reached", Toast.LENGTH_SHORT).show()
            }


        }
        // Clear the text views
        buttonClear.setOnClickListener {
            editTextDay.text = ""
            editTextMin.text = ""
            editTextMax.text = ""
            editTextWC.text = ""
        }
        // Button to navigate to Details View
        buttonMore.setOnClickListener {
            display = ""

            for (counter in 0 until i) {
                display += "Date: ${day[counter]}\nMix Degrees: ${morningTempreature[counter]}\nMax Degrees: ${afternoonTempreature[counter]}\nWeatcherConditions: ${actWeatherConditions[counter]}\n\n"
                averageMin += morningTemperature[counter]
                averagMax += afternoonTemperature[counter]
                averageTotal += morningTemp[counter] + afternoonTemp[counter]
            }

            averageTotal /= i
            averageMin /= i
            averageMax /= i

            displayAverage =  "Average Temp(Min): ${averageMin}\nAverage Temp(Max): ${averageMax}\nAverage Temp(Total): ${averageTotal}"
            display += displayAverage

            // Pass the data to DetailedViewActivity and start the activity
            val intent = Intent(this, DetailedViewActivity::class.java)
            intent.putExtra("DISPLAY_DATA", display)
            intent.putExtra("DISPLAY_DATA_AVG", displayAverage)
            startActivity(intent)
        }
    }


}

