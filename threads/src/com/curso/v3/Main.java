package com.curso.v3;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+", Thread is running");
	}
}

public class Main {
	public static void main(String[] args) {
		Thread t1 = new MyThread();
		t1.setName("T1");
		Thread t2 = new MyThread();
		t2.setName("T2");

		t1.start();
		t2.start();
	}
}