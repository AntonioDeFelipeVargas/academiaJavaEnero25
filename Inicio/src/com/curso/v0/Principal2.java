package com.curso.v0;

public class Principal2 {

	public static void main(String[] args) {

		int x = 10; //primitivo
		String cadena = "Hello"; //Objeto Inmutable
		StringBuilder sb = new StringBuilder("Hola"); //Objeto Mutable
		
		transforma(x,cadena,sb);
		
		System.out.println(x); //10
		System.out.println(cadena); //Hello
		System.out.println(sb); //Hola Mundo

	}
	
	static void transforma(int x, String cadena, StringBuilder sb) {
		x = x +5;
		cadena = cadena.concat(" World");
		sb = sb.append(" Mundo");
	}

}
