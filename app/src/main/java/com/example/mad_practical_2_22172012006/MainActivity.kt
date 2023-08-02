package com.example.mad_practical_2_22172012006

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method called")
    }
    var TAG = "MainActivity"
    fun showMessage(message:String)
    {
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val obj:ConstraintLayout? = findViewById(R.id.mainconstraint)
        if(obj!==null)
        {
            Snackbar.make(obj,message,Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart method called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume method called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart method called")
    }
}