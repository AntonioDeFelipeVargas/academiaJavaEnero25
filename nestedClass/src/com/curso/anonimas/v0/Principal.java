package com.curso.anonimas.v0;

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
			
	public static void main(String[] args) {
		
		String name = "Filologo";

		//Anonymous class: A special case of a local class that does not have a name
		Operacion opeSuma = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Suma [x=" + x + ", y=" + y + "]");
				return x+y;
			}
		};
		
		Operacion opePontencia = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Potencia [x=" + x + ", y=" + y + "]");
				return (int)(Math.pow(x, y));
			}
		};
				
		System.out.println("V1 Anonymous class" + name);
		
		Operacion[] ops = {opeSuma,
				new	Resta(),
				opePontencia,
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
