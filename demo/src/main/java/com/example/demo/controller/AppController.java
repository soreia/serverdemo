package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.server.UserService;

@RestController
@RequestMapping("/api")
public class AppController implements ErrorController{

    @Autowired
    private UserService userService;
    
    @GetMapping("/hello")
    public String sayHello() {

        User user = userService.getUser(1);
        return "Hello, World!" + user.getName();
    }
    @RequestMapping("/error")
    public String handleError() {
        // put your custom error handling logic here
        return "An error has occurred.";
    }
}
