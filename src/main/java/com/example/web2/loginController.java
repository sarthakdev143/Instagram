package com.example.web2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class loginController {
    @Autowired
    private loginServices loginServices;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpSession session,
            Model model) {
        // Validate user credentials
        if (loginServices.authenticate(username, password)) {
            session.setAttribute("username", username);
            return "profile"; // Redirect to home page after successful login
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "index"; // Return to login form with error message
        }
    }
}
