package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloPaas {

    @RequestMapping("/hello")
    public String hello(){
        return "hello Paas111111111111!";
    }







}
