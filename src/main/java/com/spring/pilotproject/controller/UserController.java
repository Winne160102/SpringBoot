package com.spring.pilotproject.controller;

import com.spring.pilotproject.entity.User;
import com.spring.pilotproject.model.dto.UserDTO;
import com.spring.pilotproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getListUser(){
        List<UserDTO> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id){
        System.out.println(id);
        return null;
    }

    @PostMapping("")
    public ResponseEntity<?> createUser(){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(){
        return null;
    }
}
