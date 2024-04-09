package com.example.NeoPay.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table (name = "User")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String userEmail;
    private String password;
    private String confirmPassword;
    private Date dateOfBirth;
    private String userAddress;
    private int userPhoneNumber;
    private boolean TermsPolicy;
    private boolean privatePolicy;
}
