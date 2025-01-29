package com.curso.v11;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = List.of(
			new Empleado("Herodion",25,100.00), 
			new Empleado("Aristobulo",20,10.00), 
			new Empleado("Urbano",28,200.00), 
			new Empleado("Nereo",19,50.00), 
			new Empleado("Nereo",19,50.00), 
			new Empleado("Epeneneto",100,10000.00) 
		);
		
		
		Comparator<Empleado> compEmpNom = 
				(o1, o2) -> o1.nombre.compareTo(o2.nombre);
			
		Comparator<Empleado> compEmpEdad = 
				(x,y) -> x.edad - y.edad;
		
		Comparator<Empleado> compEmpSueldo = 
				(pato1,pato2) -> (int)(pato2.sueldo-pato1.sueldo);
			
		
		Set<Empleado> setEmpleado = new TreeSet<>((x,y) -> x.edad - y.edad);
		setEmpleado.addAll(listaEmpleados);
		
		//setEmpleado.remove(new Empleado("Epeneneto",20,10.00));
		
		setEmpleado.forEach(emp -> System.out.println(emp));
		
	}

}
