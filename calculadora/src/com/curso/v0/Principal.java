package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		Operacion ope = new Suma(8,4);
		
		System.out.println(ope);
		System.out.println(ope.ejecuta());
	}

}
