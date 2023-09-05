package com.example.demo.service;

import com.example.demo.dao.TasksRepository;
import com.example.demo.dao.TasksRepository;
import com.example.demo.util.Tasks;
import com.example.demo.util.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
class TaskService implements TaskServiceInterface {

    @Autowired
    private TasksRepository tasksCrudRepo;

    public Tasks addTasks(Tasks tasks) {

        Tasks savedTasks = tasksCrudRepo.save(tasks);
        return savedTasks;

    }

    public Optional<Tasks> getTasks(Long id) {
        Optional<Tasks> tasks = tasksCrudRepo.findById(id);
        return tasks;
    }
    public List<Tasks> getAllTasks() {

        List<Tasks> taskList = tasksCrudRepo.findAll();
        return taskList;
    }

    public Tasks updateTasks(Tasks newTasks, Long id) {
       Tasks task = tasksCrudRepo.findById(id)
                .map(Tasks -> {
                    Tasks.setDescription(newTasks.getDescription());
                    Tasks.setTitle(newTasks.getTitle());
                    Tasks.setDueDate(newTasks.getDueDate());
                    Tasks.setStatus(newTasks.getStatus());
                    return tasksCrudRepo.save(Tasks);
                })
                .orElseGet(() -> {
                    newTasks.setTaskId(id);
                    return tasksCrudRepo.save(newTasks);
                });
       return task;
    }

    public void deleteTasksId(Long id) {
        tasksCrudRepo.deleteById(id);
    }

}

