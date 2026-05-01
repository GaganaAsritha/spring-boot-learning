package com.asritha.demo;

import org.springframework.stereotype.Service;

@Service
public class AuthService{

    public String login(String username, String password){
        if(username.equals("admin") && password.equals("1234")){
            return "Login Success";
        }
        return "Invalid Credentials";
    }
}
