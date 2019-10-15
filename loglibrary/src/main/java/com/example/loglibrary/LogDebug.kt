package com.example.loglibrary

import android.util.DebugUtils
import android.util.Log

class LogDebug {
    companion object{
        fun setDebugLog(name: String){
            Log.d(DEBUG_NAME, name)
        }
    }
}

const val DEBUG_NAME= "check_info"