package com.example.demo_review.network

import java.lang.Exception

data class NetResult<T>(val data:T,val errorCode:Int,val errorMsg:String)
fun <T> NetResult<T>.dataCheck():T{
    return when (this.errorCode == 0) {
        true -> this.data
        false -> {
            throw CustomeException(this.errorCode.toString(),this.errorMsg)
        }
    }
}