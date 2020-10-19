package com.example.demo_review.utils

import android.view.Gravity
import android.widget.Toast
import com.example.demo_review.app.LApplication

class ToastUtils {
    companion object{
        fun show(msg:String?){
            msg?.let {
                val toast= Toast.makeText(LApplication.mInstance,it,Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER,0,0)
                toast.show()
            }

        }
    }
}