package com.bootx.bo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public Object home(){
        return "Hello";
    }
}
