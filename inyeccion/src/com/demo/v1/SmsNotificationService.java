package com.demo.v1;

public class SmsNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sms sent: " + message);
	}

}
