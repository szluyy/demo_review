package com.example.demo_review.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetWorkManager private constructor(){
    var service:INetworkService
    init {
      val retrofit= Retrofit.Builder().baseUrl("https://www.wanandroid.com/")
          .addConverterFactory(GsonConverterFactory.create())
          .build()
      service=  retrofit.create(INetworkService::class.java)
    }
    companion object{
        val instance: NetWorkManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            NetWorkManager()
        }
    }
}