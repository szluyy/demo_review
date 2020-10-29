package com.example.demo_review;

import com.example.ExtendKt;
import com.example.StringUtils;

import org.junit.Test;

public class SingleTest {
    @Test
    public void test(){
       String name= Singleton2.get().name;
    }
}
