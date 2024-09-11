package com.example.auth_application.controller;

import com.example.auth_application.dto.request.user.SigninRequest;
import com.example.auth_application.dto.response.user.ErrorResponse;
import com.example.auth_application.dto.response.user.SigninResponse;
import com.example.auth_application.utils.ApiException;
//import com.example.auth_application.utils.CustomException;
import com.example.auth_application.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import com.example.auth_application.utils.JwtUtil;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;


    @PostMapping("/signin")
    public ResponseEntity<ApiResponse<Object>>  signin(@RequestBody SigninRequest authenticationRequest) throws Exception {


        if (authenticationRequest.getUsername() == null){
            ApiResponse<Object> response = new ApiResponse<>(null, "error get data");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);


        }


        ApiResponse<Object> response = new ApiResponse<>(jwtUtil.generateToken(authenticationRequest.getUsername()), "success");

          return new ResponseEntity<>(response, HttpStatus.OK);





    }

    @GetMapping("/hello")
    public String sayHello() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = (String) authentication.getPrincipal();
        String id = (String) authentication.getDetails();  // Get the ID from the authentication details

        return "Hello " + username + " with ID: " + id;
    }
    @GetMapping("/user-info")
    public String getUserInfo(@RequestHeader("Authorization") String token) {
        return "User information is retrieved successfully!";
    }

    @GetMapping("/status")
    public String getStatus() {
        return "API is running!";
    }
}
