package com.abhijeetroshan.springboot.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping( value = "/", method = RequestMethod.POST)
    public String helloWorld()
    {
        return "Hi this is Abhijeet Roshan!!";
    }
}