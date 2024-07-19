package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG = "LC"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate method is called in Main Activity ")

        binding.button1.setOnClickListener {
           Intent(this,TestActivity::class.java).apply { startActivity(this) }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart method is called in Main Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume method is called in Main Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause method is called in Main Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop method is called in Main Activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart method is called in Main Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy method is called in Main Activity")
    }
}