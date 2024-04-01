package com.dk.userInfo.controller;

import com.dk.userInfo.dto.UserDto;
import com.dk.userInfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userDetails")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/addUser")
    public ResponseEntity<UserDto> saveRestaurant(@RequestBody UserDto userDto){
        UserDto userAdded=userService.addUser(userDto);
        return new ResponseEntity<>(userAdded, HttpStatus.CREATED);
    }
    @GetMapping("/fetchById/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Integer id){
        ResponseEntity<UserDto> userDetails1=userService.findById(id);
       return userDetails1;
    }
}
