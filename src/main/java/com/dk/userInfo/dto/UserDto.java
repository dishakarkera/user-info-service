package com.dk.userInfo.dto;

import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {



    private int id;
    private String username;
    private String userpassword;
    private String address;
    private String city;

}
