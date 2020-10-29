package com.example.demo_review

class Singleton3 private constructor(){
    companion object{
      val INSTANCE:Singleton3 by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
          Singleton3()
      }
    }
}