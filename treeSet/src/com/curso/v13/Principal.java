package com.curso.v13;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("V13");
		
		List<Empleado> listaEmpleados = List.of(
			new Empleado("Herodion",25,100.00), 
			new Empleado("Aristobulo",20,10.00), 
			new Empleado("Urbano",28,200.00), 
			new Empleado("Nereo",19,80.00), 
			new Empleado("Nereo",30,80.00), 
			new Empleado("Epeneneto",100,10000.00) 
		);
		
		Comparator<Empleado> comparator = 
				Comparator.comparing(Empleado::getNombre)
						  .thenComparingDouble(Empleado::getSueldo)
						  .thenComparingInt(Empleado::getEdad)
						  .reversed();
						  
		Set<Empleado> setEmpleado = new TreeSet<>(comparator);
		
		setEmpleado.addAll(listaEmpleados);
		
		setEmpleado.forEach(System.out::println);
	
		
	}

}
