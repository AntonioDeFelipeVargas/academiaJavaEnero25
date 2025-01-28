package com.curso.normal.v0;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V0");
		
		Operacion[] ops = {new Suma(8,4),
				new Resta(8,4),
				new Potencia(8,4),
				new Multiplicacion(8,4)
				};
		
		//List<Operacion> lista = Arrays.asList(ops);
		//System.out.println(lista.getClass());
		
		List<Operacion> lista = new ArrayList<>(Arrays.asList(ops));
		lista.add(new Potencia(6,3));
		
		for(Operacion o : lista)
			ejecuta (o);
	}
	
	static void ejecuta(Operacion ope) {
		System.out.println(ope);
		System.out.println(ope.ejecuta());
	}

}
