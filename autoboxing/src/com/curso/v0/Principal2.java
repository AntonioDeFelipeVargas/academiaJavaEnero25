package com.curso.v0;

public class Principal2 {

	public static void main(String[] args) {
		
		Integer[] array0 = {Integer.valueOf(1),
							Integer.valueOf(2),
							Integer.valueOf(3)
		};

		Integer[] array1 = {1,2,3,4,5}; //AUTOBOXING
		
		int suma = 0;
		for(int i:array1) { //UNBOXING
			Integer dato = i; //AUTOBOXING
			suma += dato; //UNBOXING
		}
		System.out.println("Suma: "+suma);
	}

}
