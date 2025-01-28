package com.demo.v0;

public class Principal {

	public static void main(String[] args) {

		NotificationService notificationService1 = new EmailNotificationService();
		NotificationService notificationService2 = new SmsNotificationService();
		
		UserService userService = new UserService(notificationService1);

        userService.registerUser("JohnDoe");
   
	}

}
