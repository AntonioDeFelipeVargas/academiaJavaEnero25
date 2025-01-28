package com.curso.normal.v1;

public class Suma implements Operacion {
	
	@Override
	public int ejecuta(int x,int y) {
		System.out.println("Suma [x=" + x + ", y=" + y + "]");
		return x+y;
	}

}
