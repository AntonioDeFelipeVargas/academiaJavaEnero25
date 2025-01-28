package com.demo.v0;

public class UserService {
	
	private final NotificationService notificationService;
	
	// Inyección por constructor
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String username) {
        System.out.println("User registered: " + username);
        notificationService.sendNotification("Welcome " + username + "!");
    }
}
