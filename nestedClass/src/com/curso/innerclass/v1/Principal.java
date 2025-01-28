package com.curso.innerclass.v1;

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
	
	String name = "Filologo";

	//Inner class: A non-static type defined at the member level of a class
	class Suma implements Operacion {
		@Override
		public int ejecuta(int x,int y) {
			System.out.println("Suma [x=" + x + ", y=" + y + "]");
			return x+y;
		}
	}
	
	class Potencia implements Operacion {
		@Override
		public int ejecuta(int x, int y) {
			System.out.println("Potencia [x=" + x + ", y=" + y + "]");
			return (int)(Math.pow(x, y));
		}
	}

		
	public static void main(String[] args) {
		
		Principal prin = new Principal();
		
		System.out.println("V1 Inner Class "+prin.name);
		
		Operacion[] ops = {prin.new Suma(),
				new Resta(),
				prin.new Potencia(),
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
