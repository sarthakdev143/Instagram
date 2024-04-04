package com.example.web2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JavaController {
    @Autowired
    private JavaServices JavaServices;

    @GetMapping("/")
    public String index(Model model) {
        loginBean userInfo = new loginBean();
        model.addAttribute("userInfo", userInfo);
        return "index";
    }

    @GetMapping("/sign-up")
    public String signUp(Model model) {
        JavaBean newUserData = new JavaBean();
        model.addAttribute("userInfo", newUserData);
        return "sign-up";
    }

    @PostMapping("/save-user")
    public String saveUser(@ModelAttribute("userInfo") JavaBean newUserData) {
        JavaServices.saveUser(newUserData);
        return "redirect:/";
    }

    @GetMapping("/admin-panel")
    public String adminPanel(Model model) {
        List<JavaBean> userList = JavaServices.getUsersFromDatabase();
        model.addAttribute("userList", userList);
        return "admin-panel";
    }

    @GetMapping("/edit/{id}")
    public String editProfile(@PathVariable(value = "id") Long id, Model model) {
        JavaBean userInfo = JavaServices.getUserById(id);
        model.addAttribute("userInfo", userInfo);
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable(name = "id") Long id) {
        JavaServices.deleteUser(id);
        return "redirect:/admin-panel";
    }
}
