package com.demo.v1;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Email sent: " + message);
	}

}
