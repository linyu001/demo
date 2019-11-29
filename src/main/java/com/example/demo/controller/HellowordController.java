package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/demo")
public class HellowordController {

    @RequestMapping("/hello")
    public String index() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        return "Hello World,"+sdf.format(new Date());
    }
}