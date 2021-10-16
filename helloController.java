package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    // Handles request at /hello
    @GetMapping("hello")
    @ResponseBody
    public String hello (){
        return "Hello, Spring!";
    }

    // Handles request at /goodbye
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye (){
        return "Hello, Spring!";
    }
}
