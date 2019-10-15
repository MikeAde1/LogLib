package com.example.logerror

import android.util.Log

class LogError {
    companion object{
        fun setErrorLog(name: String){
            Log.d(ERROR_NAME, name)
        }
    }
}
const val ERROR_NAME= "check_error"
