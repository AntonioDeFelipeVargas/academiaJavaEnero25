package com.curso.v6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version Generic");

		List<Empleado> listaEmpleados = List.of(
				new Empleado("Herodion",25,100.00), 
				new Empleado("Aristobulo",22,10.00), 
				new Empleado("Urbano",28,200.00), 
				new Empleado("Nereo",19,50.00), 
				new Empleado("Epeneneto",50,10000.00) 
			);
		
		listaEmpleados = new ArrayList<>(listaEmpleados);
		
		Predicate<Empleado> pre1 = e -> e.edad>20;
		
		Predicate<Empleado> pre2 = x -> x.nombre.endsWith("o");
		
		Predicate<Empleado> pre3 = pato -> pato.sueldo < 200;
				
		System.out.println("Mayores a 20 años O Sueldo < 200");
		listaEmpleados.removeIf((pre1.or(pre3)).negate());
		listaEmpleados.forEach(System.out::println);
		
	}

}
