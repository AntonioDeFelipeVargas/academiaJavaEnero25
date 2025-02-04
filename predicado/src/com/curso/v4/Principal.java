package com.curso.v4;

import java.util.List;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version Predicate");

		List<Empleado> listaEmpleados = List.of(
				new Empleado("Herodion",25,100.00), 
				new Empleado("Aristobulo",20,10.00), 
				new Empleado("Urbano",28,200.00), 
				new Empleado("Nereo",19,50.00), 
				new Empleado("Epeneneto",50,10000.00) 
			);
		
		Predicate<Empleado> pre1 = e -> e.edad>20;
		
		Predicate<Empleado> pre2 = x -> x.nombre.endsWith("o");
		
		Predicate<Empleado> pre3 = pato -> pato.sueldo < 200;
		
		
		System.out.println("Mayor a 20 años");
				
		for (Empleado e:listaEmpleados) {
			if (pre1.test(e))
				System.out.println(e);
		}
		
		System.out.println("Nombre termina en 'o'");
		
		for (Empleado e:listaEmpleados) {
			if (pre2.test(e))
				System.out.println(e);
		}
		
		System.out.println("Sueldo menor a 200");
		
		for (Empleado e:listaEmpleados) {
			if (pre3.test(e))
				System.out.println(e);
		}
		
		System.out.println("Longitud nombre <= 7");
		
		Predicate<String> pre4 = s -> s.length()<=7;
		
		for (Empleado e:listaEmpleados) {
			if (pre4.test(e.nombre))
				System.out.println(e);
		}
		
		
	}

}
