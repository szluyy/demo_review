package com.example.demo_review.app

import android.app.Application

class LApplication:Application() {
    companion object {
       lateinit  var  mInstance: LApplication
    }

    override fun onCreate() {
        super.onCreate()
        mInstance=this
    }

}