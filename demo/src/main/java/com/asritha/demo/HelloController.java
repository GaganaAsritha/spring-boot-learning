package com.asritha.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false) String name){
        if(name == null){
            return "Hello Guest";
        }
        return "Hello " + name;
    }
}