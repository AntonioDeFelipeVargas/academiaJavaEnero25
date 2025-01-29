package com.curso.v7;

import java.util.*;

class ComparatorEmpEdad implements Comparator<Empleado> {
	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.edad - o2.edad;
	}
}

public class Principal {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = List.of(
			new Empleado("Herodion",25,100.00), 
			new Empleado("Aristobulo",20,10.00), 
			new Empleado("Urbano",28,200.00), 
			new Empleado("Nereo",19,50.00), 
			new Empleado("ZZZZZ",19,50.00), 
			new Empleado("Epeneneto",100,10000.00) 
		);
		
		Set<Empleado> setEmpleado = new TreeSet<>(new ComparatorEmpEdad());
		setEmpleado.addAll(listaEmpleados);
		
		setEmpleado.remove(new Empleado("Epeneneto",20,10.00));
		
		setEmpleado.forEach(emp -> System.out.println(emp));
		
		
		
		
	}

}
