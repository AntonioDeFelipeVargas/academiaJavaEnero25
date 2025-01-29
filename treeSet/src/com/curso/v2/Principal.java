package com.curso.v2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = List.of(
			new Empleado("Herodion",25,100.00),
			new Empleado("Aristobulo",20,10.00),
			new Empleado("Urbano",28,200.00),
			new Empleado("Nereo",19,50.00),
			new Empleado("Nereo",19,50.00),
			new Empleado("Epeneneto",30,60.00)
		);
		
		Set<Empleado> setEmpleado = new TreeSet<>(listaEmpleados); //NO FUNCIONA
		
		setEmpleado.remove(new Empleado("Aristobulo",20,10.00));
		
		setEmpleado.forEach(emp -> System.out.println(emp));
		
		
		
		
	}

}
