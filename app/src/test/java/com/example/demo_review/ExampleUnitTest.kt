package com.example.demo_review

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val c=String::class
        println(c)

        val c1= String::class.java
        println(c1)
        val str="asdasd"
        val c3=String::javaClass
        println(c3)


        println("s1===${str.javaClass}")
        println("s1===${str::class}")
        println("s1===${str::class.java}")

        var i=128
        var j=128
        assertEquals(true,i==j)
    }
}
