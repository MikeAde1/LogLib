package com.example.loglib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logerror.LogError
import com.example.loglibrary.LogDebug

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogDebug.setDebugLog("arrived")
        LogError.setErrorLog("Error Arriving")
    }
}
