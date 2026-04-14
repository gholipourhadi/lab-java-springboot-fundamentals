package com.example.week4springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String greetUser(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/add/{firstNumber}/{secondNumber}")
    public String addNumbers(@PathVariable String firstNumber,
                             @PathVariable String secondNumber) {
        try {
            int a = Integer.parseInt(firstNumber);
            int b = Integer.parseInt(secondNumber);
            return String.valueOf(a + b);
        } catch (Exception e) {
            return "Invalid input: please enter valid numbers.";
        }
    }

    @GetMapping("/multiply/{firstNumber}/{secondNumber}")
    public String multiplyNumbers(@PathVariable String firstNumber,
                                  @PathVariable String secondNumber) {
        try {
            int a = Integer.parseInt(firstNumber);
            int b = Integer.parseInt(secondNumber);
            return String.valueOf(a * b);
        } catch (Exception e) {
            return "Invalid input: please enter valid numbers.";
        }
    }
}