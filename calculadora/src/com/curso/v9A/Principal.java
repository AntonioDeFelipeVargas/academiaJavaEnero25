package com.curso.v9A;

import java.util.Arrays;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V9 Object");
		
		Object[] objs = {new Suma(8,4),
				new StringBuilder("Hello Java"),
				new Suma(9,6),
				new Resta(8,4),
				"Hola Mundo",
				new Potencia(8,4),
				new Multiplicacion(8,4)
				};
		
		List<Object> lista = Arrays.asList(objs);
		
		for(Object o : lista)
			ejecuta(o);
	}
	
	static void ejecuta(Object obj) {
		if( obj instanceof Operacion ) {
			System.out.println(obj);
			System.out.println(((Operacion)obj).ejecuta());
		}
		else
			System.out.println(obj.getClass().getName());
	}

}
