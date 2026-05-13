package com.example.monolith.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.monolith.service.CreditService;

@RestController
@RequestMapping("/credit-score")
public class Controller {
    private final CreditService creditService;

    public Controller(CreditService creditService) {
        this.creditService = creditService;
    }

    @GetMapping("/{userId}")
    public double getScore(@PathVariable Long userId) {
        return creditService.calculateScore(userId);
    }
}