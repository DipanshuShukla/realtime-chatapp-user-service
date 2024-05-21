package com.dipanshushukla.realtimechatappuserservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dipanshushukla.realtimechatappuserservice.dto.UserDTO;
import com.dipanshushukla.realtimechatappuserservice.service.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long userId) {
        UserDTO userDTO = service.getUserById(userId);
        return ResponseEntity.ok(userDTO);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<String> updateUserById(@PathVariable Long userId, @RequestBody UserDTO userDTO) {
        service.updateUserById(userId, userDTO);
        return ResponseEntity.ok().body("User updated successfully.");
    }
    
    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteById(@PathVariable Long userId){
        service.deleteById(userId);
        return ResponseEntity.ok().body("User deleted Successfully.");
    }
    
    @GetMapping()
    public ResponseEntity<UserDTO> getUserByUsername(@RequestParam(required = true) String username) {
        UserDTO userDTO = service.getUserByUsername(username);
        return ResponseEntity.ok().body(userDTO);
    }
    
    
}
