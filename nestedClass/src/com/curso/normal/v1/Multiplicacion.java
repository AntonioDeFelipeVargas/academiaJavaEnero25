package com.curso.normal.v1;

public class Multiplicacion implements Operacion {
	
	@Override
	public int ejecuta(int x, int y) {
		System.out.println("Multiplicacion [x=" + x + ", y=" + y + "]");
		return x*y;
	}

}