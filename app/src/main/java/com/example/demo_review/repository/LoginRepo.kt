package com.example.demo_review.repository

import android.util.Log
import com.example.demo_review.bean.Article
import com.example.demo_review.network.NetWorkManager
import com.example.demo_review.network.PageData
import com.example.demo_review.network.dataCheck
import com.example.demo_review.viewmodel.LoginVM
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginRepo{

   suspend fun login(username:String,password:String):PageData<Article>{
      return withContext(Dispatchers.IO) {
         NetWorkManager.instance.service.getArticleList().dataCheck()
      }
   }
}