package com.curso.v0;

public class Principal3 {

	public static void main(String[] args) {

		int x = 10; //primitivo
		String cadena = "Hello"; //Objeto Inmutable
		StringBuilder sb = new StringBuilder("Hola"); //Objeto Mutable
		
		cadena = transforma(x,cadena,sb);
		
		System.out.println(x); //10
		System.out.println(cadena); //Hello World <========
		System.out.println(sb); //Hola Mundo

	}
	
	static String transforma(int x, String cadena, StringBuilder sb) {
		x = x +5;
		//cadena = cadena.concat(" World").intern();
		cadena = cadena.concat(" World");
		sb.append(" Mundo");
		return cadena;
	}

}
