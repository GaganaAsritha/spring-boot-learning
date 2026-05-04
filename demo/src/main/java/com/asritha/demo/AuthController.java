package com.asritha.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

@PostMapping("/login")
public ResponseEntity<ApiResponse<String>> login(@Valid @RequestBody LoginRequest request){

       String result = authService.login(request.username, request.password);

       ApiResponse<String> response = new ApiResponse<>(200, result);

       return new ResponseEntity<>(response,HttpStatus.OK);
    }
}