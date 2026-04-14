package com.example.week4springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}