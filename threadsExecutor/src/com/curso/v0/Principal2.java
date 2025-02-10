package com.curso.v0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Principal2 {

	public static void main(String[] args) throws InterruptedException {

		Runnable printInventory = () -> System.out.println("Printing zoo inventory");
		
		Runnable printRecords = () -> {
			for (int i = 0; i < 3; i++)
				System.out.println("Printing record: " + i);
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		System.out.println("begin"); //<== main
		
		service.execute(printInventory);
		service.execute(printRecords); 
		service.execute(printInventory);
		Thread.sleep(1);
		System.out.println("end"); //<== main
		
		service.shutdown();
	}

}
