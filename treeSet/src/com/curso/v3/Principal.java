package com.curso.v3;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = List.of(
			new Empleado("Herodion",25,100.00), //3
			new Empleado("Aristobulo",20,10.00), //2
			new Empleado("Urbano",28,200.00), //4
			new Empleado("Nereo",19,50.00), //1
			new Empleado("Nereo",19,50.00), //???????? NO
			new Empleado("Epeneneto",30,60.00) //5
		);
		
		Set<Empleado> setEmpleado = new TreeSet<>(listaEmpleados);
		
		setEmpleado.remove(new Empleado("Aristobulo",30,10.00));
		
		setEmpleado.forEach(emp -> System.out.println(emp));
		
		
		
		
	}

}
