package com.example.tdd.unit;

import com.example.tdd.model.Task;
import com.example.tdd.service.EmailService;
import com.example.tdd.service.NotificationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class NotificationServiceTest {

    @Mock
    private EmailService emailService;

    @InjectMocks
    private NotificationService notificationService;

    @BeforeEach
    public void setUp() {
        notificationService = new NotificationService(emailService);
    }

    @Test
    public void shouldReturnNotificationMessageWhenTaskCompleted() {
        Task task = new Task("Complete TDD", "Finish writing unit tests");
        task.setCompleted(true);
        when(emailService.prepareMessage(anyString())).thenReturn("Email prepared: Complete TDD");

        String message = notificationService.notifyIfTaskCompleted(task);

        assertEquals("Email prepared: Complete TDD", message);
    }
}
