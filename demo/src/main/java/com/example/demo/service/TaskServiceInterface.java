package com.example.demo.service;

import com.example.demo.util.Tasks;

import java.util.List;
import java.util.Optional;

public interface TaskServiceInterface {

    public Tasks addTasks(Tasks emp);

    public List<Tasks> getAllTasks();

    Optional<Tasks > getTasks(Long id);

    public Tasks updateTasks(Tasks tasks, Long id);

    public void deleteTasksId(Long id);

    }
