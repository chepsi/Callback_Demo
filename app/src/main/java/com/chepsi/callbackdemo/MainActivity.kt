package com.chepsi.callbackdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (Variables.isNetworkConnected){
            //Do something when network is connected
        }
        else {
            //Do something else when network is not connected
        }
    }
}