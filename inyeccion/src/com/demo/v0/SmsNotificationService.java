package com.demo.v0;

public class SmsNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sms sent: " + message);
	}

}
