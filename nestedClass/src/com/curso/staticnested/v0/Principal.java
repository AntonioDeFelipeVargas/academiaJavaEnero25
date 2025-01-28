package com.curso.staticnested.v0;

import java.util.*;

class Resta implements Operacion {
	@Override
	public int ejecuta(int x, int y) {
		System.out.println("Resta [x=" + x + ", y=" + y + "]");
		return x-y;
	}
}

class Multiplicacion implements Operacion {
	@Override
	public int ejecuta(int x, int y) {
		System.out.println("Multiplicacion [x=" + x + ", y=" + y + "]");
		return x*y;
	}
}


public class Principal {
	
	static String name = "Filologo";

	//Static nested class: A static type defined at the member level of a class
	static class Suma implements Operacion {
		@Override
		public int ejecuta(int x,int y) {
			System.out.println("Suma [x=" + x + ", y=" + y + "]");
			return x+y;
		}
	}
	
	static class Potencia implements Operacion {
		@Override
		public int ejecuta(int x, int y) {
			System.out.println("Potencia [x=" + x + ", y=" + y + "]");
			return (int)(Math.pow(x, y));
		}
	}

		
	public static void main(String[] args) {
				
		System.out.println("V0 Static Nested " + Principal.name);
		
		Operacion[] ops = {new Principal.Suma(),
				new	Resta(),
				new Principal.Potencia(),
				new Multiplicacion()
				};
		
		List<Operacion> lista = new ArrayList<>(Arrays.asList(ops));
				
		for(Operacion o : lista)
			ejecuta (o);
	}
	
	static void ejecuta(Operacion ope) {
		System.out.println(ope.ejecuta(8,4));
		System.out.println(ope.getClass());
	}

}
