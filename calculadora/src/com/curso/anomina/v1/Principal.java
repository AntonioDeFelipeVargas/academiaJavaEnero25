package com.curso.anomina.v1;

import java.util.Arrays;
import java.util.List;

import com.curso.anomina.v0.Operacion;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V1 Clases Anonimas");
		
		Operacion[] ops = {
				
		new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Suma: x:"+x+" y:"+y);
				return x+y;
			}
		},
		new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Resta: x:"+x+" y:"+y);
				return x-y;
			}
		},
		new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Potencia: x:"+x+" y:"+y);
				return (int)Math.pow(x, y);
			}
		},
		new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Multi: x:"+x+" y:"+y);
				return x * y;
			}
		}
				
		};
		
		List<Operacion> lista = Arrays.asList(ops);
		
		for(Operacion o : lista)
			ejecuta (o);
	}
	
	static void ejecuta(Operacion ope) {
		System.out.println(ope.ejecuta(8,4));
	}

}
