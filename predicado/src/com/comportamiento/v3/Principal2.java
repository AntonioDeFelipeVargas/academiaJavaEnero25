package com.comportamiento.v3;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		
		Predicado<Empleado> pre = e -> {
			System.out.println("***PASO1***");
			boolean b = e.getEdad()>20;
			return b;
		};
		
		//Predicado<Empleado> otroPre = pre.soyYo();
		//otroPre.probar(new Empleado("Aristobulo",20,10.00));
		
		Predicado<Empleado> preNegate = pre.negate();
		
		boolean res = preNegate.probar(new Empleado("Aristobulo",1,10.00));
		
		System.out.println("Fin de Programa: "+res);
		
		
		

	}

}
