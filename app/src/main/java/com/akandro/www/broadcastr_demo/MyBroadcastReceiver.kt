package com.akandro.www.broadcastr_demo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

/**
 * Created by akshay on 8/3/2018.
 */
class MyBroadcastReceiver(var tview: TextView) :BroadcastReceiver(){



    override fun onReceive(p0: Context?, p1: Intent?) {
        tview.text =p1!!.action
    }

}