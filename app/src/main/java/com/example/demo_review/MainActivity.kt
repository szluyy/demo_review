package com.example.demo_review

import android.Manifest
import android.app.AlertDialog
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import com.example.demo_review.adapter.ArticleAdapter
import com.example.demo_review.ui.BaseActivity
import com.example.demo_review.utils.ToastUtils
import com.example.hello
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    var adapter:ArticleAdapter?=null
    var isReject:Boolean=false
    override fun initView() {
        super.initView()
//        recycler.layoutManager= LinearLayoutManager(this)
//        val loginVM:LoginVM by viewModels()
//        loginVM.data.observe(this, Observer {
//            adapter=ArticleAdapter(this,it)
//            recycler.adapter=adapter
//        })
//
////        var inten=Intent(this,MainActivity::javaClass)
//        loginVM.login("","")

    }

    override fun onStop() {
        super.onStop()
    }
    override fun onDestroy() {
        super.onDestroy()

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==1){
            if(grantResults[0]!=PackageManager.PERMISSION_GRANTED){
                isReject=true
            }
        }
    }

    override fun getLayoutId()=R.layout.activity_main
}
