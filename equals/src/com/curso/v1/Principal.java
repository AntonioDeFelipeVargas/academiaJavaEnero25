package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		int i1 = 5;
		int i2 = 6;
		
		System.out.println(i1==i2); //false
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		System.out.println(s1==s2.intern()); //true

		
	}

}
