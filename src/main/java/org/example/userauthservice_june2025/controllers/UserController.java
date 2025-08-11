package org.example.userauthservice_june2025.controllers;

import org.example.userauthservice_june2025.dtos.UserDto;
import org.example.userauthservice_june2025.models.User;
import org.example.userauthservice_june2025.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public UserDto getUserDetails(@PathVariable Long id) {
      User user = userService.getUserDetailsBasedOnId(id);
      if(user == null) return null;
      return from(user);
    }

    UserDto from(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
