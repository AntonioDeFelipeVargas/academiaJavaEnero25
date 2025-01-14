package com.curso.v7;

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
		
		//1 Bloques static 
		
		//2 Bloques instancia / Constructor
		Estudiante e1 = new Estudiante("Epeneto");
		System.out.println("*********");
		//2 Bloques instancia / Constructor
		Estudiante e2 = new Estudiante("Andronico");

		System.out.println("Fin de Programa");
	}
}
