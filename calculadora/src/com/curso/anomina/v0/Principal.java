package com.curso.anomina.v0;

import java.util.Arrays;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V0 Clases Anonimas");
		
		Operacion suma = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Suma: x:"+x+" y:"+y);
				return x+y;
			}
		};
		
		Operacion resta = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Resta: x:"+x+" y:"+y);
				return x-y;
			}
		};
		
		Operacion potencia = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Potencia: x:"+x+" y:"+y);
				return (int)Math.pow(x, y);
			}
		};
		
		Operacion multi = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Multi: x:"+x+" y:"+y);
				return x * y;
			}
		};
		
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
