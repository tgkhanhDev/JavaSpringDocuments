package com.springwithThymeLeaf.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    //new a controller method to show initial HTML Form
    @RequestMapping("/showForm")
    public String showForm(){

        return "helloworld-form";
    }
}
