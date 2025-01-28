package com.curso.normal.v1;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V1");
		
		Operacion[] ops = {new Suma(),
				new Resta(),
				new Potencia(),
				new Multiplicacion()
				};
		
		List<Operacion> lista = new ArrayList<>(Arrays.asList(ops));
				
		for(Operacion o : lista)
			ejecuta (o);
	}
	
	static void ejecuta(Operacion ope) {
		System.out.println(ope.ejecuta(8,4));
	}

}
