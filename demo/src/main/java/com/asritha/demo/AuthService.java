package com.asritha.demo;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class AuthService{

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    private final String storedUsername = "admin";
    private final String storedPassword = encoder.encode("1234");

    public String login(String username, String password){
        if(username.equals(storedUsername) && encoder.matches(password, storedPassword)){
            return "Login Success";
        }
        return "Invalid Credentials";
    }
}
