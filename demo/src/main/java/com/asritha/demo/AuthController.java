package com.asritha.demo;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController{

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@Valid @RequestBody LoginRequest request){
        return authService.login(request.username, request.password);
    }
}