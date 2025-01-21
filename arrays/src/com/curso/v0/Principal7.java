package com.curso.v0;

import java.util.Arrays;

public class Principal7 {
	
	public static void main(String[] args) {
						
		String[] strings = { "stringValue" };
		
		Object[] objects = strings;
		
		//java.lang.ArrayStoreException
		//objects[0] = new StringBuilder(); // Careful!
		
		int[] numbers = { 6, 9, 1 }; 
		Arrays.sort(numbers); 
		for (int i = 0; i < numbers.length; i++) 
			System.out.print(numbers[i] + " ");
		System.out.println("***");
		String[] stringsOther = { "10", "9", "100" }; 
		Arrays.sort(stringsOther); 
		for (String s : stringsOther) 
			System.out.print(s + " "); //10,100,9
		
		System.out.println("***");
		String[] stringsOther1 = { "1","aa","", "a", "A" }; 
		Arrays.sort(stringsOther1); 
		for (String s : stringsOther1) 
			System.out.print(s + " "); 
		
		char c = 0;
		System.out.println("("+c+")");
				
	}

}
