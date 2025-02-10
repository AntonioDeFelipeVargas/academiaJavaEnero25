package com.curso.v0;

public class Principal2 {

	public static void main(String[] args) {
		System.out.println("Hello, Principal2!");
		
		Thread thread1 = new Thread(() -> System.out.println("Thread01"));
		Thread thread2 = new Thread(() -> System.out.println("Thread02"));
		Thread thread3 = new Thread(() -> System.out.println("Thread03"));
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("End Program");

		
	}

}
