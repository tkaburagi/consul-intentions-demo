package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JapanApplication {

    public static void main(String[] args) {
        SpringApplication.run(JapanApplication.class, args);
    }

    @GetMapping
    public String japan(){
        return "Japan";
    }
}
