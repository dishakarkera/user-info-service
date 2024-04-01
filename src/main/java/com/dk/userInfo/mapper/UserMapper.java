package com.dk.userInfo.mapper;

import com.dk.userInfo.dto.UserDto;
import com.dk.userInfo.model.UserDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {


    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);

    UserDetails mapUserDTOToUser(UserDto userDto);
    // RestaurantDto mapRestaurantToRestaurantDTO(Restaurant restaurant);


    UserDto mapUserToUserDTO(UserDetails userDetails);
}
