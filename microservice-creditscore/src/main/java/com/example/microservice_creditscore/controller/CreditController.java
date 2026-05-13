package com.example.microservice_creditscore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.microservice_creditscore.model.User;

@RestController
@RequestMapping("/scores")
public class CreditController {
    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${user.service.url}")
    private String userServiceUrl;

    @GetMapping("/{userId}")
    public double getScore(@PathVariable Long userId) {
        String url = userServiceUrl + "/users/" + userId;
        // String url = "http://localhost:8081/users/" + userId;
        User user = restTemplate.getForObject(url, User.class);

        if (user == null) {
            return 0;
        }

        return (user.getIncome() * 0.2 + user.getSavings() * 0.8 / 1000);
    }

}