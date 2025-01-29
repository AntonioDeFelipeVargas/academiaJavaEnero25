package com.curso.v12;

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
		
		Set<Empleado> setEmpleado;
		
		System.out.println("***POR EDAD***");
		setEmpleado = new TreeSet<>((x,y) -> x.edad - y.edad);
		setEmpleado.addAll(listaEmpleados);
		setEmpleado.forEach(emp -> System.out.println(emp));
		
		System.out.println("***POR SUELDO***");
		setEmpleado = new TreeSet<>((emp1,emp2) -> (int)(emp1.sueldo - emp2.sueldo));
		setEmpleado.addAll(listaEmpleados);
		setEmpleado.forEach(emp -> System.out.println(emp));
		
		System.out.println("***POR NOMBRE***");
		setEmpleado = new TreeSet<>((w,z) -> w.nombre.compareTo(z.nombre));
		setEmpleado.addAll(listaEmpleados);
		setEmpleado.forEach(emp -> System.out.println(emp));
		
		System.out.println("***POR ????***");
		setEmpleado = new TreeSet<>((w,z) -> 0);
		setEmpleado.addAll(listaEmpleados);
		setEmpleado.forEach(emp -> System.out.println(emp));
		
	}

}
