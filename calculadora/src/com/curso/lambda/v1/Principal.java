package com.curso.lambda.v1;

import java.util.Arrays;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V1 Lambdas");
		
		Operacion[] ops = {(x,y) -> x+y,
				(w,z) -> w-z,
				(dato1,dato2) -> (int)Math.pow(dato1, dato2),
				(pato1,pato2) -> pato1*pato2
			};
		
		List<Operacion> lista = Arrays.asList(ops);
		
		for(Operacion o : lista)
			ejecuta (o);
	}
	
	static void ejecuta(Operacion ope) {
		System.out.println(ope.ejecuta(8,4));
	}

}
