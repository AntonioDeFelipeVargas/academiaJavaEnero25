package com.curso.v3;

public class Empleado implements Comparable<Empleado> {
	
	String nombre;
	int edad;
	double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}

	@Override
	public int compareTo(Empleado o) {
		//SI EL PRIMERO ES MAYOR QUE EL SEGUNDO 
		//REGRESA UN VALOR POSITIVO
		if (this.edad > o.edad)
			return 100;
		//SI EL PRIMERO ES MENOR QUE EL SEGUNDO 
		//REGRESA UN VALOR NEGATIVO
		else if (this.edad < o.edad)
			return -50;
		//SI SON IGUALES REGRESA CERO
		else return 0;
	}

}
