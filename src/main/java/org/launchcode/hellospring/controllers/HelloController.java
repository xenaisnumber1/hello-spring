package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//import javax.websocket.server.PathParam;

@Controller
@ResponseBody
@RequestMapping("hello") //This means that this is automatically part of the path
//All controllers will begin with a specific word ie "hello"
public class HelloController {

//    // Handles request at /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello (){
//        return "Hello, Spring!";
//    }

    // Handles request at /goodbye
    @GetMapping("goodbye")
    public String goodbye (){
        return "Goodbye, Spring!";
    }

//    //handles request og the form /hello?name=LaunchCode
//    @RequestMapping(method= {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){return "Hello, " + name + "!";}

    // Handles request at /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm(){
       return "<html>" +
               "<body>" +
               "<form action='hello'>" + //submit a request to /hello
               "<input type='text' name='name'>" +
               "<input type='submit' value='Greet me!'>" +
               "</form>" +
               "</body>" +
               "</html>";
    }
}
