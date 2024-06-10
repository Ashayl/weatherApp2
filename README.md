Ashayl Pather
ST10443318
The purpose of the app will be to give the weather for the week as well as detailed information for each day.

Pseudocode for the app:
Start
     //Initialize buttons
    buttonMain: button = findViewById(R.Id.buttonMain)
    buttonMain.setOnClickListener
    val intent=Intent(this, MainScreenActivity:: class.java)
    startActivity(intent)

   buttonExit:button = findViewById(R.Id.buttonExit)
   buttonExit.setOnClickListener

// Initialize them
        var i: Int = 0 // Days number of entries in array
        var display: String = "" // Display blank first
        val maxEntries = 7 // Only allow 7 array entries

       var Min: Int = 0
        var Max: Int = 0
        var Day: Int = 0
        var weatherCondition: String = ""

// Create arrays
        val day = Array(maxEntries) { "" }
        val min = Array(maxEntries) { 0 }
        val max = Array(maxEntries) { 0 }
        val weatherConditions = Array(maxEntries) { "" }

        val btnInsert: Button = findViewById<Button>(R.id.btnInsert)
        val btnDetails: Button = findViewById<Button>(R.id.btnDetails)
        val btnClear: Button = findViewById<Button>(R.id.btnClear)
  
        btnInsert.setOnClickListener 
     // Check if there's enough entries
            if (i < maxEntries) 
    // Convert to display types
                day[i] = dateTv.text.toString()
                min[i] =
                 min.text.toString().toIntOrNull() ?: 0 // 0 is for error checking
                max[i] =
                    max.text.toString().toIntOrNull() ?: 0 // 0 is for error checking
                actNotes[i] = actNotesTv.text.toString()
                i// Increment entry number

                Toast.makeText(this, "Entry added", Toast.LENGTH_SHORT).show()
             else 
                Toast.makeText(this, "Maximum entries reached",     Toast.LENGTH_SHORT).show()
            

    // Clear the text views
        btnClear.setOnClickListener {
            dayTv.text = ""
            minTv.text = ""
            maxTv.text = ""
            weatherConditionTv.text = ""
        


        // Button to navigate to Details View
        btnDetails.setOnClickListener {
            display = ""

            for (counter in 0 until i) {
                display += "Date: ${day[counter]}\nMin: ${morningTime[counter]}\nMax: ${Max[counter]}\nNotes: ${actNotes[counter]}\n\n"
                averageMin += min[counter]
                averageMax+= Max[counter]
                averageWeatherConditions += min[counter] + max[counter]
            
            averageWeatherConditions/= i
            averageMin /= i
            averageMax /= i

displayAverage =  "Average Min: ${averageMin}\nAverage Max: ${averageMax}\nAverage WeatherConditions: ${averageTotal}"
            display += displayAverage

  // Pass the data to DetailedViewActivity and start the activity
            val intent = Intent(this, DetailedViewActivity::class.java)
            intent.putExtra("DISPLAY_DATA", display)
            intent.putExtra("DISPLAY_DATA_AVG", displayAverage)
            startActivity(intent)
        
    




val btnMainMenu: Button = findViewById<Button>(R.id.btnMainMenu)
        val tvDetails = findViewById<TextView>(R.id.tvDetails)
        val displayData = intent.getStringExtra("DISPLAY_DATA")
        tvDetails.text = displayData

        //val tvAvg = findViewById<TextView>(R.id.tvAvg)
        //val displayAverage = intent.getStringExtra("DISPLAY_DATA_AVG")
        //tvAvg.text = displayAverage


        btnMainMenu.setOnClickListener {
            val intent = Intent(this, MainScreenActivity::class.java)
            startActivity(intent)
Stop
