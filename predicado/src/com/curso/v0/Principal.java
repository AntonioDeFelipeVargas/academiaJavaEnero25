package com.curso.v0;

import java.util.List;

class Mayor20 implements Predicado{
	@Override
	public boolean probar(Empleado e) {
		return e.edad>20;
	}
}

class TerminaO implements Predicado{
	@Override
	public boolean probar(Empleado e) {
		return e.nombre.endsWith("o");
	}
}

class SueldoMenor200 implements Predicado{
	@Override
	public boolean probar(Empleado e) {
		return e.sueldo < 200;
	}
}

public class Principal {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = List.of(
				new Empleado("Herodion",25,100.00), 
				new Empleado("Aristobulo",20,10.00), 
				new Empleado("Urbano",28,200.00), 
				new Empleado("Nereo",19,50.00), 
				new Empleado("Nereo",19,50.00), 
				new Empleado("Epeneneto",50,10000.00) 
			);
		
		System.out.println("Mayor a 20 años");
		
		Predicado pre1 = new Mayor20();
		
		for (Empleado e:listaEmpleados) {
			if (pre1.probar(e))
				System.out.println(e);
		}
		
		System.out.println("Nombre termina en 'o'");

		
		Predicado pre2 = new TerminaO();
		
		for (Empleado e:listaEmpleados) {
			if (pre2.probar(e))
				System.out.println(e);
		}
		
		System.out.println("Sueldo menor a 200");

		Predicado pre3 = new SueldoMenor200();
		
		for (Empleado e:listaEmpleados) {
			if (pre3.probar(e))
				System.out.println(e);
		}
	}

}
