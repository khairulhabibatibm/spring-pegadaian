package com.example.springpegadaian;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String hello(){
        return "Hello World xxxxx";
    }
    
}
