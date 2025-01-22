package com.curso.v1;

public class Principal {
	
	public static void main(String[] args) {
		Operacion ope = new Suma(8,4);
		
		System.out.println(ope);
		System.out.println(ope.ejecuta());
		
		Operacion ope1 = new Resta(8,4);
		
		System.out.println(ope1);
		System.out.println(ope1.ejecuta());
	}

}
