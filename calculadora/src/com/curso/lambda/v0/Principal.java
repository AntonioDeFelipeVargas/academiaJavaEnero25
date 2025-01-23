package com.curso.lambda.v0;

import java.util.Arrays;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V0 Lambdas");
		
		Operacion suma = (x,y) -> x+y;
		
		Operacion resta = (w,z) -> w-z;
		
		Operacion potencia = (dato1,dato2) -> (int)Math.pow(dato1, dato2);
		
		Operacion multi = (pato1,pato2) -> pato1*pato2;
		
		Operacion[] ops = {suma,
				resta,
				potencia,
				multi
				};
		
		List<Operacion> lista = Arrays.asList(ops);
		
		for(Operacion o : lista)
			ejecuta (o);
	}
	
	static void ejecuta(Operacion ope) {
		System.out.println(ope.ejecuta(8,4));
	}

}
