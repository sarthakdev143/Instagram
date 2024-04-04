package com.example.web2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServices {
    @Autowired
    private JavaRepository JavaRepository;

    public boolean authenticate(String username, String password) {
        JavaBean userInfo = JavaRepository.findByUsername(username);
        if (userInfo != null && userInfo.getPassword().equals(password)) {
            return true; // Authentication successful
        }
        return false; // Authentication failed
    }
}
