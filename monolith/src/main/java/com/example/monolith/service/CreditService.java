package com.example.monolith.service;

import com.example.monolith.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CreditService {

    private final Map<Long, User> users = new HashMap<>();

    public CreditService() {
        users.put(1L, new User(1L, "Adam", 100, 500));
        users.put(2L, new User(2L, "Bobby", 200, 800));
    }

    public double calculateScore(Long userId) {
        User user = users.get(userId);

        if (user == null) {
            return 0;
        }

        return (user.getIncome() * 0.2 + user.getSavings() * 0.8 / 1000);
    }
}