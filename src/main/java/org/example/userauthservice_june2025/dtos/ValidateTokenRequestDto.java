package org.example.userauthservice_june2025.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ValidateTokenRequestDto {
    private String token;
    private Long userId;
}
