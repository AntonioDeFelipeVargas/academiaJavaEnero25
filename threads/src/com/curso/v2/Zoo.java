package com.curso.v2;

public class Zoo {
	
	public static void pause() {
		System.out.println(Thread.currentThread().getName()+ " start.");
		try {
			Thread.sleep(10_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " finished.");
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+ " start.");
		Thread job = new Thread(() -> pause());
		job.setName("Thread Job");
		job.setDaemon(false);
		job.start();
		Thread.sleep(5_000);
		System.out.println(Thread.currentThread().getName()+ " finished.");

	}

}
