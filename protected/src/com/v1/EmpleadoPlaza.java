package com.v1;

import com.v0.Empleado;

public class EmpleadoPlaza extends Empleado {
	
	public static void main(String[] args) {
		System.out.println("EmpleadoPlaza");
		
		System.out.println(Empleado.nombre);
		System.out.println(Empleado.getNombre());
		
		System.out.println(EmpleadoPlaza.nombre);
		System.out.println(EmpleadoPlaza.getNombre());
	}

}
