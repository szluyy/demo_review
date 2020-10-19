package com.example.demo_review.network

import com.example.demo_review.bean.Article
import retrofit2.http.GET

interface INetworkService {
    @GET("article/list/1/json")
    suspend fun getArticleList():NetResult<PageData<Article>>
}