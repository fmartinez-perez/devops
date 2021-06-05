package com.fmaperez.devops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Greetings {

    @RequestMapping("/")
    public String saludar(){
        return "Hola";
    }
}