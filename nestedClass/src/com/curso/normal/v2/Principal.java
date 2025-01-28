package com.curso.normal.v2;

import java.util.*;

class Suma implements Operacion {
	@Override
	public int ejecuta(int x,int y) {
		System.out.println("Suma [x=" + x + ", y=" + y + "]");
		return x+y;
	}
}

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

class Potencia implements Operacion {
	@Override
	public int ejecuta(int x, int y) {
		System.out.println("Potencia [x=" + x + ", y=" + y + "]");
		return (int)(Math.pow(x, y));
	}
}

public class Principal {
	public static void main(String[] args) {
		System.out.println("V2");
		
		Operacion[] ops = {new Suma(),
				new Resta(),
				new Potencia(),
				new Multiplicacion()
				};
		
		List<Operacion> lista = new ArrayList<>(Arrays.asList(ops));
				
		for(Operacion o : lista)
			ejecuta (o);
	}
	
	static void ejecuta(Operacion ope) {
		System.out.println(ope.ejecuta(8,4));
	}

}
