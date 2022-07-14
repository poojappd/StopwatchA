package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import android.widget.Toast

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra("some")

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
    override fun onStart() {
        Toast.makeText(applicationContext, "2nd onStart Called", Toast.LENGTH_LONG).show()
        super.onStart()

    }

    override fun onResume() {
        val toast  = Toast.makeText(applicationContext, "2nd onResume() called", Toast.LENGTH_LONG).show()
        super.onResume()
    }

    override fun onPause() {
        val toast  = Toast.makeText(applicationContext, "2nd Activity is paused", Toast.LENGTH_LONG).show()
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(applicationContext, "2nd ACTIVITY STOPPED", Toast.LENGTH_LONG).show()
        super.onStop()
    }
    override fun onDestroy() {
        Toast.makeText(applicationContext, "2nd act DESTROYED COMPLETELYY", Toast.LENGTH_LONG).show()
        super.onDestroy()
    }

}