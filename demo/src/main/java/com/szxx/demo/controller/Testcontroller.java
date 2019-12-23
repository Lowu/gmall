package com.szxx.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {

    @RequestMapping("/doTest")
    public String doTest(){
        return "hello world";
    }
}
