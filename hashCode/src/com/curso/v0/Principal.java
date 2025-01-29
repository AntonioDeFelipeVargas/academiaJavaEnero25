package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		Carta corazon7 = new Carta("7","Corazon");
		Carta corazon4 = new Carta("4","Corazon");
		Carta corazonOtro4 = new Carta("4","Corazon");
		Carta diamante4 = new Carta("4","Diamante");
		Carta diamante7 = new Carta("7","Diamante");
		
		System.out.println("corazon4.equals(corazonOtro4)");
		System.out.println(corazon4.equals(corazonOtro4)); //true
		
		System.out.println("diamante4.equals(diamante7)");
		System.out.println(diamante4.equals(diamante7)); //false

	}

}
