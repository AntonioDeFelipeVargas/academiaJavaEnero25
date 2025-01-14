package com.curso.v6;

class Estudiante{
	
	{
		System.out.println("Bloque Instancia 1");
	}
	
	String nombre;
	
	
	static {
		System.out.println("Bloque Static 1");
	}
	
	Estudiante(String nombre){
		this.nombre = nombre;
		System.out.println("Paso por Constructor");
	}
	
	{
		System.out.println("Bloque Instancia 2");
	}
	
	static {
		System.out.println("Bloque Static 2");
	}
	
}

public class Principal {
	public static void main(String[] args) {
		Estudiante e = new Estudiante("Epeneto");
		System.out.println("Fin de Programa");
	}
}
