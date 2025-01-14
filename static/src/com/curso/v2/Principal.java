package com.curso.v2;

class Pato{
	//Variables de instancia de Clase (Objetos)
	private String nombre; //null
	private int edad; //0
	
	//Variable de Clase
	private static int contador; //0
	
	public Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	
	//Método de instancia de Clase (Objetos)
	int getContador() {
		return contador;
	}
}
public class Principal {
	public static void main(String[] args) {
		
		//System.out.println(pato2.getContador());
		
		Pato pato1 = new Pato("Donald",4);
		Pato pato2 = new Pato("Lucas",3);
		Pato pato3 = new Pato("Patito Feo",2);
		
		System.out.println(pato3.getContador()); //3 
//		System.out.println(Pato.contador); //3
//		System.out.println(Pato.contador); //3
		
	}

}
