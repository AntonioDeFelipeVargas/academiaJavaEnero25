package com.guia.v1;

public class Bees {

	public static void main(String[] args) {
		new Bees().go();
		System.out.println("Fin Programa");
	}

	synchronized void go() {
		Thread t1 = 
				new Thread(()->System.out.println("t1"));
		t1.start();
		System.out.println("1 ");
	}
}
