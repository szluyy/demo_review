package com.example.demo_review

import com.example.demo_review.adapter.ArticleAdapter
import com.example.demo_review.ui.BaseActivity

class MainActivity : BaseActivity() {
    var adapter:ArticleAdapter?=null

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

    override fun getLayoutId()=R.layout.activity_main
}
