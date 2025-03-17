package com.example.emailservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@Entity
@Table(name = "users")
public class User {


    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String email;
    private String password;
    private String firstName;
    private boolean isEnabled;
}
