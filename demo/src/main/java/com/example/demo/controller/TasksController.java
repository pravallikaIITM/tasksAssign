package com.example.demo.controller;


import com.example.demo.service.TaskServiceInterface;
import com.example.demo.service.UserServiceInterface;
import com.example.demo.util.Tasks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class TasksController {

   TaskServiceInterface TasksServiceInterface;

   @PostMapping("/api/tasks")
    ResponseEntity<Tasks> newTasks(@RequestBody Tasks newTasks) {
        Tasks task = TasksServiceInterface.addTasks(newTasks);
        return new ResponseEntity<Tasks>(task, HttpStatus.CREATED);
    }

    @GetMapping("/api/tasks/{taskId}")
    ResponseEntity<Optional<Tasks>> getTasks(@PathVariable Long id) {
        Optional<Tasks> task = TasksServiceInterface.getTasks(id);
        return new ResponseEntity<Optional<Tasks>>(task,HttpStatus.FOUND);
    }

    @GetMapping("/api/tasks")
    ResponseEntity<List<Tasks>> getAllTasks() {
       List<Tasks> task = TasksServiceInterface.getAllTasks();
        return new ResponseEntity<List<Tasks>>(task,HttpStatus.FOUND);
    }

    @PutMapping("/api/tasks/{taskId}")
    ResponseEntity<Tasks> replaceTasks(@RequestBody Tasks newTasks, @PathVariable Long id) {

        Tasks task = TasksServiceInterface.updateTasks(newTasks,id);
        return new ResponseEntity<Tasks>(task,HttpStatus.OK);
    }

    @DeleteMapping("/api/tasks/{taskId}")
    ResponseEntity<String> deleteTasks(@PathVariable Long id) {

        TasksServiceInterface.deleteTasksId(id);
        return new ResponseEntity<>("",HttpStatus.OK);
    }

}
