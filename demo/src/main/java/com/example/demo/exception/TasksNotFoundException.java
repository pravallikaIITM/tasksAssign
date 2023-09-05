package com.example.demo.exception;

public class TasksNotFoundException extends RuntimeException {

    public TasksNotFoundException(String title) {
        super("Could not find task " + title);
    }
}