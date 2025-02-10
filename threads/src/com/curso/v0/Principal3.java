package com.curso.v0;

class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread01");
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread02");
	}
}

class MyThread3 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread03");
	}
}

public class Principal3 {

	public static void main(String[] args) {
		System.out.println("Hello, Principal3!");
		
		new MyThread1().start();
		new MyThread2().start();
		new MyThread3().start();
		
		System.out.println("End Program");

		
	}

}
