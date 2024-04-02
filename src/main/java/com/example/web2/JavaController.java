package com.example.web2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavaController {
    @Autowired
    private JavaServices JavaServices;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/sign-up")
    public String signUp(Model model) {
        JavaBean newUserData = new JavaBean();
        model.addAttribute("newUserData", newUserData);
        return "sign-up";
    }
}
