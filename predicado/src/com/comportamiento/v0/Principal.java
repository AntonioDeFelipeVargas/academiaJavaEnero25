package com.comportamiento.v0;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version Generic");

		List<Empleado> listaEmpleados = List.of(
				new Empleado("Herodion",25,100.00), 
				new Empleado("Aristobulo",20,10.00), 
				new Empleado("Urbano",28,200.00), 
				new Empleado("Nereo",19,50.00), 
				new Empleado("Epeneto",50,150.00) 
			);
		
		listaEmpleados = new ArrayList<>(listaEmpleados);
		
		Predicado<Empleado> pre1 = e -> e.getEdad()>20;
				
		Predicado<Empleado> pre3 = pato -> pato.getSueldo() < 200;
		//                            this     pre
		Predicado<Empleado> predAnd = pre1.and(pre3);
		
		System.out.println("Mayor a 20 años && sueldo menor 200");
		for (Empleado e:listaEmpleados) {
			if (predAnd.probar(e))
				System.out.println(e);
		}
		
		System.out.println("sueldo menor 200 && Nombre termine con O");
		for (Empleado e:listaEmpleados) {
			if (pre3.and(z -> z.getNombre().endsWith("o")).probar(e))
				System.out.println(e);
		}
		
		System.out.println("Edad mayor 20 && Nombre termine con O");
		for (Empleado e:listaEmpleados) {
			if (pre1.and(z -> z.getNombre().endsWith("o")).probar(e))
				System.out.println(e);
		}

	}

}
