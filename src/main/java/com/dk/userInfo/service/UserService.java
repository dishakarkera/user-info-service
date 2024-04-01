package com.dk.userInfo.service;

import com.dk.userInfo.dto.UserDto;
import com.dk.userInfo.mapper.UserMapper;
import com.dk.userInfo.model.UserDetails;
import com.dk.userInfo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDto addUser(UserDto userDto) {
        UserDetails saveUser = userRepository.save(UserMapper.INSTANCE.mapUserDTOToUser(userDto));
        return UserMapper.INSTANCE.mapUserToUserDTO(saveUser);

    }

    public ResponseEntity<UserDto> findById(Integer id) {
        Optional<UserDetails> byId = userRepository.findById(id);
        return byId.map(userDetails -> new ResponseEntity<>(UserMapper.INSTANCE.mapUserToUserDTO(userDetails), HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));

    }
}
