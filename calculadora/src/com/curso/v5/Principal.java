package com.curso.v5;

import java.util.Arrays;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V5");
		Operacion ope0 = new Suma(8,4);	
		Operacion ope1 = new Resta(8,4);
		Operacion ope2 = new Potencia(8,4);
		Operacion ope3 = new Multiplicacion(8,4);
		
		Operacion[] ops = {ope0,ope1,ope2,ope3};
		List<Operacion> lista = Arrays.asList(ops);
		
		for(Operacion o : lista)
			ejecuta (o);
	}
	
	static void ejecuta(Operacion ope) {
		System.out.println(ope);
		System.out.println(ope.ejecuta());
	}

}
