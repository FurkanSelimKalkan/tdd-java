package com.example.tdd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Boolean isCompleted;

    public Task() {
    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    /**
     * Returns the title of the Task
     *
     * @return the title of the task
     */
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void setCompleted(boolean b) {
        this.isCompleted = true;
    }
}

