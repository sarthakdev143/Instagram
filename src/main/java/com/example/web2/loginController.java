package com.example.web2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class loginController {
    @Autowired
    private loginServices loginServices;

    @GetMapping("/login")
    public String login(@ModelAttribute("userInfo") loginBean loginInfo) {
        
        return "";
    }
}
