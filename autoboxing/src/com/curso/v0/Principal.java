package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		int quack = 5;
		Integer quackquack = Integer.valueOf(quack); 
		int quackquackquack = quackquack.intValue();
		
		int i = 10;
		Integer dato = i;
		int e = dato;
		
		long l = 8;
		Long badGorilla = 8l; //AUTOBOXING
		
		Character elephant = 'a'; 
		char badElephant = elephant;
		
		System.out.println(badElephant);

	}

}
