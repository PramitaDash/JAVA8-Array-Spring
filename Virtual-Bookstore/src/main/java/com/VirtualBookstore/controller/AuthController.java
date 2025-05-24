package com.VirtualBookstore.controller;

import com.VirtualBookstore.payroll.LoginDto;
import com.VirtualBookstore.payroll.UserDto;

import com.VirtualBookstore.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/auth")
@AllArgsConstructor
public class AuthController {

    private final UserServiceImpl service;

    @PostMapping("/sign-up")
    public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {

        String response = service.createUser(userDto);

        if(response.equals("User created successfully")){
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> varifyLogin(@RequestBody LoginDto loginDto){
        Boolean status = service.authenticate(loginDto);
        if(status){
            return new ResponseEntity<>(true, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(false, HttpStatus.OK);
        }
    }
}
