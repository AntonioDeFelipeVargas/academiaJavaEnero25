package com.curso.v0;

import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class Calculadora2 {

	public static void main(String[] args) {

		List<DoubleBinaryOperator> listaOperaciones = List.of(
		   (x, y) -> {
			System.out.println("Suma x:" + x + ", y:" + y);
			return x + y;
		}, (x, y) -> {
			System.out.println("Resta x:" + x + ", y:" + y);
			return x - y;
		}, (x, y) -> {
			System.out.println("Multi x:"+x+", y:"+y);
			return x*y;
		}, (x, y) -> {
			System.out.println("Division x:"+x+", y:"+y);
			return x/y;
		}, (x, y) -> {
			System.out.println("Potencia x:"+x+", y:"+y);
			return Math.pow(x, y);
		});

		listaOperaciones.forEach(x -> System.out.println(x.applyAsDouble(8, 4)));
	}

}
