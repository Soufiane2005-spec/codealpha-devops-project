package com.soufiane.devopsproject.devopsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello DevOps - CodeAlpha Project 🚀";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running successfully ✅";
    }
}