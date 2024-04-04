package com.example.web2;

import org.springframework.data.repository.CrudRepository;

public interface JavaRepository extends CrudRepository<JavaBean, Long> {

    JavaBean findByUsername(String username);
    
}
