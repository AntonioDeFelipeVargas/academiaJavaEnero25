package com.curso.v5;

class Counter {
	private int count = 0;

	public synchronized void increment() {
		//System.out.println(Thread.currentThread().getName());
		count++;
		System.out.println(count);
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
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName()+" i: "+ i);
			counter.increment();
		}
	}

}

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		Thread t1 = new MyThread(counter); 
		Thread t2 = new MyThread(counter);
		
		t1.setName("t1");
		t2.setName("t2");

		t1.start();
		//i //count //count++ //count
		//0 //0     //1       //1
		//1 //2     //3       //3
		
		t2.start();
		//i //count //count++ //count
		//0 //1     //2       //2
		//1 //2     //3       //3
		
		t1.join();
		t2.join();
		
		System.out.println(counter.getCount());
	}

}
