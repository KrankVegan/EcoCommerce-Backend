package com.mikkel.ecommerce.controller;

import com.mikkel.ecommerce.dto.SignupDTO;
import com.mikkel.ecommerce.dto.UserDTO;
import com.mikkel.ecommerce.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SingupController {

    @Autowired
    private UserService userService;


    @PostMapping("/sign-up")
    public ResponseEntity<?> signupUser(@RequestBody SignupDTO signupDTO){
        UserDTO createdUser = userService.createUser(signupDTO);

        if(userService.hasUserWithEmail(signupDTO.getEmail())){
            return new ResponseEntity<>("Usuario ya Creado", HttpStatus.NOT_ACCEPTABLE);
        }

        if(createdUser == null) {
            return new ResponseEntity<>("Usuario No Creado", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
