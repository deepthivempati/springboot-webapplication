package com.springboot.webapplication.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("hello")
public class HelloController {
    public static void main(String[] args) {
        HelloController helloController = new HelloController();
        String hello = helloController.sayHello();
        System.out.println(hello);
    }
    @GetMapping("/webapp")
    public String sayHello() {
        return "hello";
    }
}
