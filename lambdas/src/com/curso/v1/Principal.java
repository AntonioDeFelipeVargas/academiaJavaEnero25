package com.curso.v1;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = List.of(
			new Empleado("Herodion",25,100.00), 
			new Empleado("Aristobulo",20,10.00), 
			new Empleado("Urbano",28,200.00), 
			new Empleado("Nereo",19,50.00), 
			new Empleado("Nereo",19,50.00), 
			new Empleado("Epeneneto",50,1000.00) 
		);
		
		listaEmpleados = new ArrayList<>(listaEmpleados);
		
		//listaEmpleados.sort((e1,e2)->e1.edad-e2.edad);
		//listaEmpleados.sort((e1,e2)->e1.nombre.compareTo(e2.nombre));
		//listaEmpleados.sort((e1,e2)-> (int)(e1.sueldo-e2.sueldo));
		
		Collections.sort(listaEmpleados,(e1,e2)->e1.nombre.compareTo(e2.nombre));
		
		//listaEmpleados.removeIf(x -> x.edad<21);
		
//		listaEmpleados.replaceAll(z -> {
//			z.sueldo += 100;
//			return z;
//		} );
	
		listaEmpleados.forEach(e -> System.out.println(e));
	}

}
