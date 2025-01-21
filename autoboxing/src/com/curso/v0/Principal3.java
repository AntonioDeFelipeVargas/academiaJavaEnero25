package com.curso.v0;

public class Principal3 {

	public static void main(String[] args) {

		int[] array1 = {1,2,3,4,5}; 
		
		int suma = 0;
		for(int i:array1) { 
			int dato = i; 
			suma += dato; 
		}
		System.out.println("Suma: "+suma);
	}

}
