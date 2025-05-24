package com.VirtualBookstore.mapping;

import com.VirtualBookstore.entity.User;
import com.VirtualBookstore.payroll.UserDto;
import org.springframework.stereotype.Component;

@Component
public class MappingUser {

    public User dtoToUser(UserDto userDto ){

        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setMobile(userDto.getMobile());
        return user;

    }

    public UserDto userToDto(User user){
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setMobile(user.getMobile());
        return dto;
    }
}