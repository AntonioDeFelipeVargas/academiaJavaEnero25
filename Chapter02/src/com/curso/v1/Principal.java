package com.curso.v1;

class Duck{
	int getAge() {
		return 0;
	}
}

public class Principal {

	public static void main(String[] args) {
		
		Duck duck = null;
		
		//            AND
		if(duck!=null && duck.getAge()<5) { 
			System.out.println("Hello");
		}
		
		System.out.println("EndProgram");
	}

}
