package com.curso.v5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version Generic");

		List<Empleado> listaEmpleados = List.of(
				new Empleado("Herodion",25,100.00), 
				new Empleado("Aristobulo",20,10.00), 
				new Empleado("Urbano",28,200.00), 
				new Empleado("Nereo",19,50.00), 
				new Empleado("Epeneneto",50,10000.00) 
			);
		
		listaEmpleados = new ArrayList<>(listaEmpleados);
		
		Predicado<Empleado> predicado1 = e -> e.edad>20;
		Predicate<Empleado> predicate1 = e -> e.edad>20;
		
		Predicado<Empleado> pre2 = x -> x.nombre.endsWith("o");
		
		Predicado<Empleado> pre3 = pato -> pato.sueldo < 200;
		
		
		System.out.println("Mayor a 20 años Predicado");
		for (Empleado e:listaEmpleados) {
			if (predicado1.probar(e))
				System.out.println(e);
		}
		
		System.out.println("Mayor a 20 años Predicate");
		listaEmpleados.removeIf(predicate1.negate());
		listaEmpleados.forEach(e -> System.out.println(e));
		

	}

}
