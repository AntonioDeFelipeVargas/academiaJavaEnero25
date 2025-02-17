package com.guia.v0;

public class Bees {

	public static void main(String[] args) {
		try {
			new Bees().go();
		} catch (Exception e) {
			System.out.println("thrown to main");
		}
		System.out.println("Fin Programa");
	}

	synchronized void go() throws InterruptedException {
		Thread t1 = 
				new Thread(()->System.out.println("t1"));
		t1.start();
		System.out.println("1 ");
		this.wait(5000);
		System.out.println("2 ");
	}
}
