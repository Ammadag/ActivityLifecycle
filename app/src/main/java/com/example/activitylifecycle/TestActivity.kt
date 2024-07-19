package com.example.activitylifecycle


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class TestActivity : AppCompatActivity() {
    private val TAG = "LC"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        Log.d(TAG, "onCreate method is called in Test Activity")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart method is called in Test Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume method is called in Test Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause method is called in Test Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop method is called in Test Activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart method is called in Test Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy method is called in Test Activity")
    }
}