package com.curso.v1;

class Estudiante{
	String nombre = "Andronico";
	int edad = 10;
	
	void estudiar() {
		System.out.println(nombre +": estudiando");
	}
}

public class PrincipalEstudiante {
	
	//Variables de instancia de Clase (Objeto)
	//Variables static 

	public static void main(String[] args) {
		
		//Variable local
		Estudiante est = null; // = new Estudiante();
		System.out.println(est.nombre);
		est.estudiar();
		
		int x=0;
		System.out.println(x);
		
	}

}
