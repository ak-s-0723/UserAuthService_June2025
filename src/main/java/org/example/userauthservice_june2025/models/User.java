package org.example.userauthservice_june2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class User extends BaseModel {
    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    @ManyToMany
    private List<Role> roleList = new ArrayList<>();
}


//1         M
//USER     ROLE
//M          1
//
//M    :  M