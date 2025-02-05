package com.curso.v0;

import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class Calculadora {

	public static void main(String[] args) {
		
		List<DoubleBinaryOperator> listaOperaciones = 
				List.of((x,y) -> x+y,
						(x,y) -> x-y,
						(x,y) -> x*y,
						(x,y) -> x/y,
						(x,y) -> Math.pow(x, y));
		
		for (DoubleBinaryOperator dbo :listaOperaciones)
			System.out.println(dbo.applyAsDouble(8,4));

	}

}
