package org.example.userauthservice_june2025.controllers;

import org.example.userauthservice_june2025.dtos.LoginRequestDto;
import org.example.userauthservice_june2025.dtos.SignupRequestDto;
import org.example.userauthservice_june2025.dtos.UserDto;
import org.example.userauthservice_june2025.dtos.ValidateTokenRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    //signup
    //login
    //validateToken

    //ToDO :
    //logout
    //forgetPassword

    @PostMapping("/signup")
    public UserDto signup(@RequestBody SignupRequestDto signupRequestDto) {
        return null;
    }


    @PostMapping("/login")
    public UserDto login(@RequestBody LoginRequestDto loginRequestDto) {
      return null;
    }

    @PostMapping("/validateToken")
    public Boolean validateToken(@RequestBody ValidateTokenRequestDto validateTokenRequestDto) {
      return null;
    }
}
