package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FranceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FranceApplication.class, args);
    }

    @GetMapping(value = "/api/france")
    public String france(){
        return "France";
    }
}
