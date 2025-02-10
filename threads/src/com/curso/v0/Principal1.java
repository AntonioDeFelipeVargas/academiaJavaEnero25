package com.curso.v0;

public class Principal1 {

	public static void main(String[] args) {
		System.out.println("Hello, Principal1!");
		
		Thread thread1 = new Thread(() -> System.out.println("Thread01"));
		thread1.start();
		
		Thread thread2 = new Thread(() -> System.out.println("Thread02"));
		thread2.start();
		
		System.out.println("End Program");
		
		Thread thread3 = new Thread(() -> System.out.println("Thread03"));
		thread3.start();
		
	}

}
