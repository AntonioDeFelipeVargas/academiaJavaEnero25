package com.curso.v0;

class Estudiante{
	String nombre = "Andronico";
	int edad = 10;
	
	void estudiar() {
		System.out.println(nombre +": estudiando");
	}
}

public class PrincipalEstudiante {
	
	Estudiante est;

	public static void main(String[] args) {
		PrincipalEstudiante pe = new PrincipalEstudiante();
		System.out.println(pe.est.nombre); //NullPointerException
		//pe.est = null;
		pe.est.estudiar(); //NullPointerException
	}

}
