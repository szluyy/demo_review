package com.example.demo_review.ui

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
import android.view.WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.example.demo_review.permission.PermissionCallback

abstract class BaseActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initView()
    }

    fun requestPermission(permissions: Array<String>,callback:PermissionCallback){
    }

    /**
     * 布局文件
     */
   abstract  fun getLayoutId():Int

    /**
     * view初始化设置
     */
    open fun initView(){

        supportActionBar?.hide()
    }

    fun setStatusBarColor(color: Int){
        window.statusBarColor=color
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
    }

    /**
     * 设置状态栏半透明
     */
    fun setStatusBarTranslucent(){
        window.addFlags(FLAG_TRANSLUCENT_STATUS)
    }

    /**
     * 设置全屏，状态栏会有过渡效果
     * 可使用主题来实现
     */
    fun setFullScreen(){
        window.addFlags(FLAG_FULLSCREEN)
    }

}