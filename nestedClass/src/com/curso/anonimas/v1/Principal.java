package com.curso.anonimas.v1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		String name = "Filologo";

		// Anonymous class: A special case of a local class that does not have a name

		System.out.println("V1 Anonymous class" + name);

		Operacion[] ops = { 
		
		new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Suma [x=" + x + ", y=" + y + "]");
				return x + y;
			}
		}, new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Resta [x=" + x + ", y=" + y + "]");
				return x - y;
			}
		}, new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Potencia [x=" + x + ", y=" + y + "]");
				return (int) (Math.pow(x, y));
			}
		}, new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Multi [x=" + x + ", y=" + y + "]");
				return x * y;
			}
		} };

		List<Operacion> lista = new ArrayList<>(Arrays.asList(ops));

		for (Operacion o : lista)
			ejecuta(o);
	}

	static void ejecuta(Operacion ope) {
		System.out.println(ope.ejecuta(8, 4));
		System.out.println(ope.getClass());
	}

}
