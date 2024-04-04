package com.example.web2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class JavaBean {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String mobileNumberOrEmail;
    
    private String password, fullname;

    public JavaBean(Long id, String username, String password, String fullname, String mobileNumberOrEmail) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.mobileNumberOrEmail = mobileNumberOrEmail;
    }

    public JavaBean() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobileNumberOrEmail() {
        return mobileNumberOrEmail;
    }

    public void setMobileNumberOrEmail(String mobileNumberOrEmail) {
        this.mobileNumberOrEmail = mobileNumberOrEmail;
    }

    @Override
    public String toString() {
        return "JavaBean [id=" + id + ", username=" + username + ", password=" + password + ", fullname=" + fullname
                + ", mobileNumberOrEmail=" + mobileNumberOrEmail + "]";
    }
}
