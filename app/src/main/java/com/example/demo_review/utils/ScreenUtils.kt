package com.example.demo_review.utils

import android.content.Context
import android.content.Context.WINDOW_SERVICE
import android.view.WindowManager

object ScreenUtils {
    fun getScreenWidth(context:Context){
        var windowManager= context.getSystemService(WINDOW_SERVICE) as WindowManager
//        windowManager.defaultDisplay.getRealMetrics()
    }
}