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
public class HashiCorpJapanApplication {

    private final RestTemplate restTemplate;

    public HashiCorpJapanApplication(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public static void main(String[] args) {
        SpringApplication.run(HashiCorpJapanApplication.class, args);
    }

    @GetMapping("/japan")
    public String hashicorpjapan() throws Exception {
        URI url = new URI("http://127.0.0.1:5000/");
        URI url1 = new URI("http://127.0.0.1:5001/api/japan");
        String messageFromHashi = restTemplate.getForEntity(url, String.class).getBody();
        String messageFromCorpJapan = restTemplate.getForEntity(url1, String.class).getBody();
        return messageFromHashi + messageFromCorpJapan;
    }


    @GetMapping(value = "/france")
    public String hashicorpfrance() throws Exception {
        URI url = new URI("http://127.0.0.1:5000/");
        URI url1 = new URI("http://127.0.0.1:5001/api/france");
        String messageFromHashi = restTemplate.getForEntity(url, String.class).getBody();
        String messageFromCorpFrance = restTemplate.getForEntity(url1, String.class).getBody();


        return messageFromHashi + messageFromCorpFrance;

    }

}
