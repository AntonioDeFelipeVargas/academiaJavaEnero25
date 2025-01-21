package com.curso.v1;

import com.curso.v0.Empleado;

public class EmpleadoPlaza extends Empleado {
	
	public static void main(String[] args) {
		
		EmpleadoPlaza emp = new EmpleadoPlaza();
		
		System.out.println(emp.nombre);
		System.out.println(emp.getNombre());
	}

}
