package com.example.myapplication

import android.annotation.SuppressLint
import android.util.Log
import com.google.common.util.concurrent.Service
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

@SuppressLint("MissingFirebaseInstanceTokenRefresh")
val notification :String = "notification"
class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.e("token","new token")
    }

}