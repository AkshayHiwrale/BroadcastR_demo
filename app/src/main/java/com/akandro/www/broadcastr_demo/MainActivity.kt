package com.akandro.www.broadcastr_demo

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {

        var i = Intent()
            i.action="myaction"
            sendBroadcast(i)

        }

        var filter = IntentFilter()
        filter.addAction(Intent.ACTION_BATTERY_CHANGED)
        filter.addAction(Intent.ACTION_ATTACH_DATA)
        filter.addAction(Intent.ACTION_HEADSET_PLUG)
        filter.addAction(Intent.ACTION_SCREEN_OFF)
        filter.addAction(Intent.ACTION_SCREEN_ON)
        filter.addAction("myaction")

        registerReceiver(MyBroadcastReceiver(tview),filter)//parameters are BroadCast Receiver Class Object and the Intent Filter


    }
}
