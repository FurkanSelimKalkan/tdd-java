package com.example.tdd.unit;

import com.example.tdd.model.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityTests {

    @Test
    public void shouldCreateTaskWithTitleAndDescription() {
        Task task = new Task("Learn TDD", "Learn how to implement TDD in Java Spring Boot");
        assertEquals("Learn TDD", task.getTitle());
        assertEquals("Learn how to implement TDD in Java Spring Boot", task.getDescription());
    }
}
