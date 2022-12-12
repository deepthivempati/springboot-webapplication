package com.springboot.webapplication.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello1() {
        return "Hello! What are you learning today?";
    }

    @RequestMapping(value="/webapp", method= RequestMethod.GET)
    //@ResponseBody  // when this is used return statement will be the output(hello) since response body calls the simple object such as string and also complex objects such as class(student class)
    public String sayHello() {
        return "Hello"; //if we are not using @Responsebody so our request is a view--> application.yml file is configured with few properties called prefix and sufix which calls the respective view(calls the hello jsp file)
    }

    @RequestMapping(value="/login", method= RequestMethod.GET)
    @ResponseBody
    public String login(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        return "Login";
    }
}
