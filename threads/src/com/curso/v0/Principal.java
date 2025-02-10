package com.curso.v0;

class MyHilo implements Runnable{
	@Override
	public void run() {
		System.out.println("Ejecuta Thread");
	}
}

public class Principal {

	public static void main(String[] args) {
		System.out.println("Hello, Reader!");
		
		Thread thread1 = new Thread(new MyHilo());
		thread1.start();
		
		Thread thread2 = new Thread(new MyHilo());
		thread2.start();
		
		Thread thread3 = new Thread(new MyHilo());
		thread3.start();
		
		System.out.println("End Program");
		
	}

}
