package com.comportamiento.v4;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = List.of(
				new Empleado("Herodion",25,100.00), 
				new Empleado("Aristobulo",20,10.00), 
				new Empleado("Urbano",28,250.00), 
				new Empleado("Nereo",21,50.00), 
				new Empleado("Patrobas",50,150.00) 
			);
		
		listaEmpleados = new ArrayList<>(listaEmpleados);
		
		Predicado<Empleado> pre1 = e -> e.getEdad()>20;
		
		Predicado<Empleado> pre2 = x -> x.getNombre().endsWith("o");
		
		Predicado<Empleado> pre3 = (Empleado pato) -> pato.getSueldo() < 200;

		Predicado<Empleado> andPred = Predicado.and(pre1,pre3);
						
		System.out.println("Mayores a 20 años && Nombre termine o");
		for (Empleado e:listaEmpleados) {
			if (Predicado.and(pre1, pre2).probar(e))
				System.out.println(e);
		}
		
		System.out.println("Mayores a 20 años && Sueldo menor 200");
		for (Empleado e:listaEmpleados) {
			if (andPred.probar(e))
				System.out.println(e);
		}
		
		System.out.println("Sueldo menor a 200 && Edad mayor 20");
		for (Empleado e:listaEmpleados) {
			if (Predicado.<Empleado>and
					(x -> x.getSueldo() < 200, 
					 z -> z.getEdad()   >  20).probar(e))
				System.out.println(e);
		}
		

	}

}
