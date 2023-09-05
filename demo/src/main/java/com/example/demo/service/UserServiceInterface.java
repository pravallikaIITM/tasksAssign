package com.example.demo.service;

import com.example.demo.util.Tasks;
import com.example.demo.util.User;

import java.util.Optional;

public interface UserServiceInterface {

    public User assignNewTasks(User user);

    public Optional<User> getUser(Long userId);

}
