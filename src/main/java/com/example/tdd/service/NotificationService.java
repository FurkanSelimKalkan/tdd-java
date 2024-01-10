package com.example.tdd.service;

import com.example.tdd.model.Task;

public class NotificationService {

    private final EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public String notifyIfTaskCompleted(Task task) {
        if (task.isCompleted()) {
            return emailService.prepareMessage("Task completed: " + task.getTitle());
        }
        return "";
    }
}
