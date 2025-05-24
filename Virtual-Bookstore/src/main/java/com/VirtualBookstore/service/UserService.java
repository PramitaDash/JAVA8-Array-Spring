package com.VirtualBookstore.service;

import com.VirtualBookstore.entity.User;
import com.VirtualBookstore.payroll.LoginDto;
import com.VirtualBookstore.payroll.UserDto;

public interface UserService {

    public String createUser(UserDto userDto);
    public boolean authenticate(LoginDto dto);
}
