package org.example.userauthservice_june2025.controllers;

import org.example.userauthservice_june2025.dtos.LoginRequestDto;
import org.example.userauthservice_june2025.dtos.SignupRequestDto;
import org.example.userauthservice_june2025.dtos.UserDto;
import org.example.userauthservice_june2025.dtos.ValidateTokenRequestDto;
import org.example.userauthservice_june2025.models.User;
import org.example.userauthservice_june2025.services.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IAuthService authService;

    //signup
    //login
    //validateToken

    //ToDO :
    //logout
    //forgetPassword

    @PostMapping("/signup")
    public ResponseEntity<UserDto> signup(@RequestBody SignupRequestDto signupRequestDto) {
        User user = authService.signup(signupRequestDto.getName(),
                signupRequestDto.getEmail(),signupRequestDto.getPassword(),
                signupRequestDto.getPhoneNumber());

        UserDto userDto = from(user);
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }


    @PostMapping("/login")
    public UserDto login(@RequestBody LoginRequestDto loginRequestDto) {
        User user = authService.login(loginRequestDto.getEmail(), loginRequestDto.getPassword());
        return from(user);
    }

    @PostMapping("/validateToken")
    public Boolean validateToken(@RequestBody ValidateTokenRequestDto validateTokenRequestDto) {
      return null;
    }

    UserDto from(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
