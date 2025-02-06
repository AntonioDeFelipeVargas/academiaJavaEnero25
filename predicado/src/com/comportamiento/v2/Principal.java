package com.comportamiento.v2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = List.of(
				new Empleado("Herodion",25,100.00), 
				new Empleado("Aristobulo",20,10.00), 
				new Empleado("Urbano",28,250.00), 
				new Empleado("Nereo",19,50.00), 
				new Empleado("Patrobas",50,150.00) 
			);
		
		listaEmpleados = new ArrayList<>(listaEmpleados);
		
		Predicado<Empleado> pre1 = e -> e.getEdad()>20;
		
		Predicado<Empleado> pre2 = x -> x.getNombre().endsWith("o");
		Predicado<Empleado> negPre2 = pre2.negate();
				
		Predicado<Empleado> pre3 = pato -> pato.getSueldo() < 200;
		
		System.out.println("Menores o igual a 20 años");
		for (Empleado e:listaEmpleados) {
			if (pre1.negate().probar(e))
				System.out.println(e);
		}
		
		System.out.println("Nombre no termine con letra o");
		for (Empleado e:listaEmpleados) {
			if (negPre2.probar(e))
				System.out.println(e);
		}
		
		System.out.println("Sueldo mayor a 200");
		for (Empleado e:listaEmpleados) {
			if (pre3.negate().probar(e))
				System.out.println(e);
		}
		

	}

}
