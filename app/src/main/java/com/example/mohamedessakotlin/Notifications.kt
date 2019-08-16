package com.example.mohamedessakotlin

import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Notification
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Notifications : AppCompatActivity() {


    lateinit var btn : Button

    //if you want the multi notification ih is like static in java
    companion object {
        var id = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

        btn = findViewById(R.id.btn)
    }

    fun notifications(view: View){

        val intent = Intent()
        val pendingIntent = PendingIntent.getActivity(this@Notifications,0,intent,0)
        val notification = Notification.Builder(this@Notifications)
            .setSmallIcon(R.drawable.notification_icon_background)
            .setContentTitle("Riad")
            .setContentText("Hello Riad")
        notification.setContentIntent(pendingIntent)
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


        notificationManager.notify(id,notification.build())
        id++

    }

    fun previous_but(view: View){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
}
