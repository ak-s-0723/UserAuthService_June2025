package org.example.userauthservice_june2025.services;

import org.example.userauthservice_june2025.models.User;
import org.example.userauthservice_june2025.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getUserDetailsBasedOnId(Long id){
        Optional<User> userOptional = userRepo.findById(id);
        if(userOptional.isEmpty()) return null;
        System.out.println(userOptional.get().getEmail());
        return userOptional.get();
    }
}
