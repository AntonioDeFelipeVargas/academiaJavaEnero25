package com.curso.v2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Map<Integer, Empleado> mapEmpleado = new HashMap<>();

		mapEmpleado.put(1, new Empleado("Herodion", 25, 100.00));
		mapEmpleado.put(2, new Empleado("Aristobulo", 20, 10.00));
		mapEmpleado.put(3, new Empleado("Urbano", 28, 200.00));
		mapEmpleado.put(4, new Empleado("Nereo", 19, 50.00));
		mapEmpleado.put(5, new Empleado("Epeneneto", 50, 1000.00));
		
		mapEmpleado.forEach((k,v)->System.out.println("Clave: "+k 
				+" , Empleado: "+v.nombre));
	}

}
