package com.curso.normal.v1;

public class Potencia implements Operacion {
	
	@Override
	public int ejecuta(int x, int y) {
		System.out.println("Potencia [x=" + x + ", y=" + y + "]");
		return (int)(Math.pow(x, y));
	}


}
