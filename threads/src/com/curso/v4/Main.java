package com.curso.v4;

class Counter {
	private int count = 0;

	public void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}

class MyThread extends Thread {
	private Counter counter;  //HAS-A

	public MyThread(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			counter.increment();
		}

	}

}

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		Thread t1 = new MyThread(counter); 
		
		t1.start();
		t1.join();
		
		//Thread.sleep(1);
		
		System.out.println(counter.getCount());
	}

}
