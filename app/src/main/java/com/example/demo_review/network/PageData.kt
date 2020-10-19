package com.example.demo_review.network

data class PageData<T>(val curPage:Int,
                        val datas:List<T>,
                        val offset:Int,
                        val pageCount:Int,
                        val size:Int,
                        val total:Int,
                        val over:Boolean)