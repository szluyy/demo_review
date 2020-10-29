package com.example.demo_review

class Singleton2 private constructor(){
   @JvmField val name="hello"
    companion object{
       private var INSTANCE:Singleton2?=null
        get(){
            if(field==null){
                field= Singleton2()
            }
            return field
        }
        @JvmStatic
        fun get():Singleton2{
            return  INSTANCE!!
        }
    }

    @JvmOverloads
   fun say(msg:String="hello"){

    }
}