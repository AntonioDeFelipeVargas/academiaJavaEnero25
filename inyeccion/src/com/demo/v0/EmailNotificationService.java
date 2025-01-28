package com.demo.v0;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Email sent: " + message);
	}

}
