package com.example.web2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JavaServices {
    @Autowired
    private JavaRepository JavaRepository;

    public JavaBean saveUser(JavaBean newUserData) {
        return JavaRepository.save(newUserData);
    }

    public List<JavaBean> getUsersFromDatabase() {
        List<JavaBean> users = (List<JavaBean>) JavaRepository.findAll();
        return users;
    }

    public JavaBean getUserById(Long id) {
        Optional<JavaBean> userData = JavaRepository.findById(id);
        JavaBean userData2 = null;
        if (userData.isPresent())
            userData2 = userData.get();
        else
            throw new RuntimeException("The requested User Of ID = " + id + " does not exist");

        return userData2;
    }

    public void deleteUser(Long id) {
        JavaRepository.deleteById(id);
    }
}