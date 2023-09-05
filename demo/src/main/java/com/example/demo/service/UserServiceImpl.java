package com.example.demo.service;

import com.example.demo.dao.TasksRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.util.Tasks;
import com.example.demo.util.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserServiceInterface{

    @Autowired
    private UserRepository userRepository;

    public User assignNewTasks(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    public Optional<User> getUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        return user;
    }
}
