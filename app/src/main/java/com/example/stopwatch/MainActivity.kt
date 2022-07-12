package com.example.stopwatch

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val toast  = Toast.makeText(applicationContext, "ACTIVITY CREATED...", Toast.LENGTH_LONG).show()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Toast.makeText(applicationContext, "onStart Called", Toast.LENGTH_LONG).show()
        super.onStart()

    }

    override fun onResume() {
        val toast  = Toast.makeText(applicationContext, "Now at onResume() call", Toast.LENGTH_LONG).show()
        super.onResume()
    }

    override fun onPause() {
        val toast  = Toast.makeText(applicationContext, "Activity is paused", Toast.LENGTH_LONG).show()
        super.onPause()

    }

    override fun onStop() {
        Toast.makeText(applicationContext, " ACTIVITY STOPPED", Toast.LENGTH_LONG).show()
        Log.e(TAG, "\n\n\nonStop: ONSTOP CALLED\n\n\n" )
        super.onStop()

    }

    override fun onDestroy() {
        Toast.makeText(applicationContext, "DESTROYED COMPLETELYY", Toast.LENGTH_LONG).show()
        Log.e(TAG, "\n\n\nACTIVITY DESTROYED!!!\n\n\n" )

        super.onDestroy()
    }
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.e(TAG, "\n\n\nonSaveInstanceState ENTERED\n\n\n" )

        Toast.makeText(applicationContext, "Instance saved uh!!", Toast.LENGTH_LONG).show()

        super.onSaveInstanceState(outState)
    }
    override fun onRestart() {
        Toast.makeText(applicationContext, "ACTIVITY IS RESTARTING>>>>", Toast.LENGTH_LONG).show()

        super.onRestart()
    }

}