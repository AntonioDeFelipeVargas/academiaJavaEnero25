package com.curso.v0;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = List.of(
			new Empleado("Herodion",25,100.00), 
			new Empleado("Aristobulo",20,10.00), 
			new Empleado("Urbano",28,200.00), 
			new Empleado("Nereo",19,50.00), 
			new Empleado("Nereo",19,10.00), 
			new Empleado("Epeneneto",100,10000.00) 
		);
		listaEmpleados = new ArrayList<>(listaEmpleados);
	
		Comparator<Empleado> comp = 
				Comparator.comparing((Empleado e) -> e.getNombre())
				          .thenComparingInt(x -> x.getEdad())
				          .thenComparingDouble(y -> y.getSueldo());
		
		listaEmpleados.sort(comp);
		listaEmpleados.forEach(System.out::println);
		
	}

}
