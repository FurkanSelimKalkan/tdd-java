package com.example.tdd.service;

import com.example.tdd.model.Task;
import com.example.tdd.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public Task addTask(Task task) {
        return taskRepository.save(task);
    }
}
