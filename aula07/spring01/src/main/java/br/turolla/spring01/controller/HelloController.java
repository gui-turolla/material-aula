package br.turolla.spring01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloController {
    
    @GetMapping("/hello")
    public String getOla(){
        return "Hello World";
    }
    @PostMapping("/hello")
    public String getOla2(){
        return "Hello World";
    }
}
