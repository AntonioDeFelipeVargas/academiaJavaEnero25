package com.curso.v0;

class MyThread4 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread04");
	}
}

class MyThread5 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread05");
	}
}

class MyThread6 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread06");
	}
}

public class Principal4 {

	public static void main(String[] args) {
		System.out.println("Hello, Principal3!");
		
		new MyThread4().run();
		new MyThread5().run();
		new MyThread6().run();
		
		System.out.println("End Program");

		
	}

}
