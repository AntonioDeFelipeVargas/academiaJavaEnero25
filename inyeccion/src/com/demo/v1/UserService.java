package com.demo.v1;

public class UserService {
	
	//HAS-A
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
