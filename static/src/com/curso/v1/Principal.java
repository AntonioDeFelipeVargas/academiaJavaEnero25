package com.curso.v1;

class Pato{
	//Variables de instancia de Clase (Objetos)
	String nombre; //null
	int edad; //0
	
	//Variable de Clase
	static int contador; //0
	
	public Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
}
public class Principal {
	public static void main(String[] args) {
		
		System.out.println(Pato.contador); //0

		Pato pato1 = new Pato("Donald",4);
		Pato pato2 = new Pato("Lucas",3);
		Pato pato3 = new Pato("Patito Feo",2);
		
		System.out.println(pato1.contador); //3 //CUIDADO
		System.out.println(Pato.contador); //3
		System.out.println(Pato.contador); //3
		
	}

}
