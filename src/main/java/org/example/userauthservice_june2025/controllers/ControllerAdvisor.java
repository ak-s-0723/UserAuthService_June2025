package org.example.userauthservice_june2025.controllers;

import org.example.userauthservice_june2025.exceptions.PasswordMismatchException;
import org.example.userauthservice_june2025.exceptions.UserAlreadyExistsException;
import org.example.userauthservice_june2025.exceptions.UserNotSignedUpException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler({UserAlreadyExistsException.class, UserNotSignedUpException.class, PasswordMismatchException.class})
    public ResponseEntity<String> handleSignupExceptions(Exception exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
