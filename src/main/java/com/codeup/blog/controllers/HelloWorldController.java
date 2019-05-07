package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "Hello from spring";
    }
//
    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHelloWithName(@PathVariable String name){
        return "Hello from " + name;
    }

    @PostMapping("/hello/{name}")
    @ResponseBody
    public String sayHelloWithName(){
        return "POST mapping works";
    }

//    @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET)
//    @ResponseBody
//    public String sayHelloWithName(@PathVariable String name){
//        return "Hello from " + name;
//    }



}
