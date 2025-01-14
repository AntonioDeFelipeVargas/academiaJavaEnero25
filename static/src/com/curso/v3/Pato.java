package com.curso.v3;

public class Pato{
	//Variables de instancia de Clase (Objetos)
	private String nombre; //null
	private int edad; //0
	
	//Variable de Clase
	public static int contador; //0
	
	public Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	
	//Método de Clase
	public static int getContador() {
		return contador;
	}
}