package com.example.NeoPay.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
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
