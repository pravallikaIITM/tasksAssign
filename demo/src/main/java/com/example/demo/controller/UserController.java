package com.example.demo.controller;

import com.example.demo.service.UserServiceInterface;
import com.example.demo.util.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class UserController {

    UserServiceInterface userServiceInterface;

    @PostMapping("/api/tasks/{userId}/tasks")
    ResponseEntity<User> assignUserTasks(@RequestBody Long userId) {
        Optional<User> user = userServiceInterface.getUser(userId);
        User user1 = new User();
        if(user.isPresent()) {
           user1  = userServiceInterface.assignNewTasks(user.get());
        }
        return new ResponseEntity<User>(user1, HttpStatus.CREATED);
    }

}

