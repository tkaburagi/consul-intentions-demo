package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@SpringBootApplication
@RestController
public class CorpApplication {

    private final RestTemplate restTemplate;

    public CorpApplication(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public static void main(String[] args) {
        SpringApplication.run(CorpApplication.class, args);
    }

    @GetMapping("/api/japan")
    public String japan() throws Exception {
        System.out.println("japan");
        URI url = new URI("http://127.0.0.1:5000/api/japan");
        String japan = restTemplate.getForEntity(url, String.class).getBody();
        return "Corp " + japan;
    }

    @GetMapping(value = "/api/france")
    public String france() throws Exception {
        System.out.println("france");
        URI url = new URI("http://127.0.0.1:5000/api/france");
        String france = restTemplate.getForEntity(url, String.class).getBody();
        return "Corp " + france;
    }

}
