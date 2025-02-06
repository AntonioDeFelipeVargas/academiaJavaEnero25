package com.comportamiento.v3;

public class Principal {

	public static void main(String[] args) {
		
		Predicado<Empleado> pre1 = e -> {
			System.out.println("***PASO1***");
			boolean b = e.getEdad()>20;
			return b;
		};
		
		pre1.probar(new Empleado("Aristobulo",20,10.00));
		
		System.out.println("Fin de Programa");
		
		
		

	}

}
