package com.VirtualBookstore.service;

import com.VirtualBookstore.entity.User;
import com.VirtualBookstore.mapping.MappingUser;
import com.VirtualBookstore.payroll.LoginDto;
import com.VirtualBookstore.payroll.UserDto;
import com.VirtualBookstore.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository repository;
    private final MappingUser mappingUser;
    private final PasswordEncoder passwordEncoder; // Inject PasswordEncoder


    @Override
    public String createUser(UserDto userDto) {
        Optional<User> opEmail = repository.findByEmail(userDto.getEmail());
        if(opEmail.isPresent()){
            return "Email is already exists";
        }

        Optional<User> opUsername = repository.findByUsername(userDto.getUsername());
        if(opUsername.isPresent()){
            return "Username is already exists";
        }

        Optional<User> opMobile = repository.findByMobile(userDto.getMobile());
        if(opMobile.isPresent()){
            return "Mobile number is already exists";
        }

        User user = mappingUser.dtoToUser(userDto);
        user.setPassword(passwordEncoder.encode(userDto.getUsername())); //encrypt password before saving
        User newUser = repository.save(user);
        return "User created successfully";
    }

    @Override
    public boolean authenticate(LoginDto dto) {

        Optional<User> opUser = repository.findByUsername(dto.getUsername());
        if (opUser.isEmpty()) {
            return false; // User not found
        }

        User user = opUser.get();

        if (user.getPassword() == null) {
            return false; // Password not set
        }

        return BCrypt.checkpw(dto.getPassword(), user.getPassword()); // Return actual comparison result

    }
}
