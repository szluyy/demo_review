package com.example.demo_review.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demo_review.utils.ToastUtils
import kotlinx.coroutines.launch

open class BaseVM :ViewModel(){
    private fun showError(msg:String?){
         ToastUtils.show(msg)
     }

      fun runCatchWrapper( block:suspend ()->Unit){
         viewModelScope.launch {
             val result=  runCatching{
                 block()
             }
             if(result.isFailure){
                 showError(result.exceptionOrNull()?.message)
             }
         }

     }
}