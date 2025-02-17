package com.curso.v1;

import com.curso.v0.Empleado;

public class EmpleadoPlaza extends Empleado {
	
	public static void main(String[] args) {
		System.out.println("EmpleadoPlaza");
		
		//VARIABLE DE REFERENCIA
		//& OBJETO
		//DEBEN SER DEL TIPO QUE HEREDA
		//PARA TENER ACCESO AL protected
		EmpleadoPlaza emp = new EmpleadoPlaza();
		//Empleado emp = new EmpleadoPlaza(); //NO TIENE ACCESO
		
		System.out.println(emp.nombre);
		System.out.println(emp.getNombre());
	}

}
