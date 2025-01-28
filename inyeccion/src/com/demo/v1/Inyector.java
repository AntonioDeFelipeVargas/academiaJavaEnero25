package com.demo.v1;

public abstract class Inyector {

	public static UserService getUserService() {
		
		NotificationService notificationService1 = new EmailNotificationService();
		NotificationService notificationService2 = new SmsNotificationService();
		
		return new UserService(notificationService1);
	}

}
