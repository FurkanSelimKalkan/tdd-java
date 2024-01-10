package com.example.tdd.integration;

import com.example.tdd.model.Task;
import com.example.tdd.repository.TaskRepository;
import com.example.tdd.service.TaskService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class IntegrationTests {

    @Autowired
    private TaskService taskService;

    @Autowired
    private TaskRepository taskRepository;

    @Test
   // @Transactional
    public void addAndFoundTask() {
        Task task = new Task("Integrate TDD", "learn how to implement TDD");
        taskService.addTask(task);
        assertTrue(taskRepository.findById(task.getId()).isPresent());
    }
}
