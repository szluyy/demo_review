package com.example.demo_review.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.demo_review.bean.Article
import com.example.demo_review.repository.LoginRepo
import kotlinx.coroutines.launch

class LoginVM :BaseVM() {
    private val loginRepo=LoginRepo()
    val data = MutableLiveData<List<Article>>()
    fun login(username:String,password:String){
        runCatchWrapper {
            data.postValue(loginRepo.login(username,password).datas)
        }
    }
}