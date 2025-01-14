package com.curso.v0;

class Pato{
	//Variables de instancia de Clase (Objetos)
	String nombre; //null
	int edad; //0
	int contador; //0
	
	public Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
}
public class Principal {
	public static void main(String[] args) {
		Pato pato1 = new Pato("Donald",4);
		Pato pato2 = new Pato("Lucas",3);
		Pato pato3 = new Pato("Patito Feo",2);
		
		System.out.println(pato1.contador); //1
		System.out.println(pato2.contador); //1
		System.out.println(pato3.contador); //1
		
		System.out.println(pato2.nombre);
	}

}
