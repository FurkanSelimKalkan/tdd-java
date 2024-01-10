package com.example.tdd.controller;

import com.example.tdd.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/api/tasks")
    public List<Task> getAllTasks() {
        return Collections.<Task>emptyList();
    }
}
