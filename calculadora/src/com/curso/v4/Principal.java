package com.curso.v4;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("V4");
		Operacion ope = new Suma(8,4);	
		System.out.println(ope);
		System.out.println(ope.ejecuta());
		
		Operacion ope1 = new Resta(8,4);
		System.out.println(ope1);
		System.out.println(ope1.ejecuta());
		
		Operacion ope2 = new Potencia(8,4);
		System.out.println(ope2);
		System.out.println(ope2.ejecuta());
	}

}
