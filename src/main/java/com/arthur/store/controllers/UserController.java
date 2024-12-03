package com.arthur.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.store.models.User;
import com.arthur.store.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<User>> listAllUsers () {
        return ResponseEntity.status(HttpStatus.OK).body(userService.listAllUsers());
    }


    @GetMapping("/list/{id}")
    public ResponseEntity<User> listUserById (@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(id));
    }
    
    
}
