package com.springboot.webapplication.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
   // @ResponseBody  // when this is used return statement will be the output(hello)
    public String sayHello() {
        return "hello"; //we are not using @Responsebody so our request is a view--> application.yml file is configured with few properties called prefix and sufix which calls the respective view(calls the hello jsp file)
    }
}
