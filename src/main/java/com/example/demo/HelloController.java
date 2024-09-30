package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @GetMapping("/hello")
    public String getHello(){
        return "<b>hello<b>";
    }
    @GetMapping("/")
    public String getHome(){
        return "<B>Welcome home automatically<B>";
    }
}
