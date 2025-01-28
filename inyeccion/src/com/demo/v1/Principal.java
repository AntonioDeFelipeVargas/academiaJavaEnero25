package com.demo.v1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V1");
		
		UserService userService = Inyector.getUserService();

        userService.registerUser("JohnDoe");
   
	}

}
