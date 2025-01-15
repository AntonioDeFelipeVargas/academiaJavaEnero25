package com.curso.v2;

class Estudiante{
	private String nombre = "Paco";
	private int edad = 5;
	
	Estudiante(){
	}
	
	Estudiante(String nombre,int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	void estudiar() {
		System.out.println(nombre +": estudiando");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}

public class PrincipalEstudiante {
	
	//Variables de instancia de Clase (Objeto)
	//Variables static 

	public static void main(String[] args) {
		
		//Variable local
		Estudiante est = new Estudiante("Andronico",10);
		System.out.println(est.getNombre());
		est.estudiar();
		
		int x=0;
		System.out.println(x);
		
	}

}
