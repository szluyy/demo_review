package com.example.demo_review.network

import org.apache.http.conn.ConnectTimeoutException
import retrofit2.HttpException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import javax.net.ssl.SSLException

class ErrorHandler {
    fun handleException(exception: Exception):CustomeException{

        return when(exception){
            is HttpException->{
                CustomeException("${exception.code()}",exception.message())
            }
            is ConnectException ->{
                CustomeException("",exception.message)
            }
            is ConnectTimeoutException ->{
                CustomeException("",exception.message)

            }
            is SocketTimeoutException ->{
                CustomeException("",exception.message)

            }
            is SSLException ->{
                CustomeException("",exception.message)

            }
            is UnknownHostException ->{
                CustomeException("",exception.message)

            }
            is CustomeException->{
                exception
            }
            else->{
                CustomeException("",exception.message)
            }
        }
    }

    /**
     * 约定异常
     */
    object ERROR {
        /**
         * 未知错误
         */
        const val UNKNOWN = 1000

        /**
         * 解析错误
         */
        const val PARSE_ERROR = 1001

        /**
         * 网络错误
         */
        const val NETWORD_ERROR = 1002

        /**
         * 协议出错
         */
        const val HTTP_ERROR = 1003

        /**
         * 证书出错
         */
        const val SSL_ERROR = 1005

        /**
         * 连接超时
         */
        const val TIMEOUT_ERROR = 1006

        /**
         * 服务器端报错
         */
        const val SERVER_SIDE_ERROR = 1007
    }
}