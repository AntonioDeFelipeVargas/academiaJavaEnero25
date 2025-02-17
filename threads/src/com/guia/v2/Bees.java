package com.guia.v2;

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
				new Thread(()->System.out.println("t1 synchronized"));
		t1.start();
		System.out.println("1 ");
		
//		synchronized(t1) {  // Sincronizamos sobre el objeto t1
//            t1.wait(5000);
//      }
		
		t1.wait(5000);
		
		System.out.println("2 ");
	}
}
