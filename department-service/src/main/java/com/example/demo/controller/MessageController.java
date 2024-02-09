package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
//RefreshScope annotation forces this bean to reload the configuration from application properties file in Github It also triggers the event to reload the configuration for this bean whenever there is any change in the config file on Github
@RestController
@RequestMapping("/api/department")
public class MessageController {

    @Value("${spring.boot.message}")
    private String message;

    @GetMapping("/message")
    public String message(){
        return message;
    }
}
