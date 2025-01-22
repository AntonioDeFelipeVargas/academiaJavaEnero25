package com.curso.v8;

import java.util.Arrays;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V8");
		
		Operacion[] ops = {new Suma(8,4),
				new Suma(9,6),
				new Resta(8,4),
				new Potencia(8,4),
				new Multiplicacion(8,4)
				};
		
		List<Operacion> lista = Arrays.asList(ops);
		
		for(Operacion o : lista)
			ejecuta (o);
	}
	
	static void ejecuta(Operacion ope) {
		System.out.println(ope);
		System.out.println(ope.ejecuta());
		if (ope instanceof Suma) {
			double d = ((Suma)ope).ejecuta(3.0,5.0); 
			System.out.println("ejecuta doubles:" + d);
		}
	}

}
