package com.curso.record;

public class Principal {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado("Patrobas",19,false);
		
		Empleado emp2 = new Empleado("Patrobas",19,false);
		
		System.out.println(emp1.toString());
		
		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1.nombre());
		System.out.println(emp1.edad());		
		
		
		
	}
}
