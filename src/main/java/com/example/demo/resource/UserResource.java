package com.example.demo.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;



@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User>findAll(){
        User user = new User(1L, "Maria", "maria@gmail.com", "9999999","1234567");
        return ResponseEntity.ok().body(user);
    }
}
