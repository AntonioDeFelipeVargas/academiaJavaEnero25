package com.curso.normal.v1;

public class Resta implements Operacion {
	
	@Override
	public int ejecuta(int x, int y) {
		System.out.println("Resta [x=" + x + ", y=" + y + "]");
		return x-y;
	}

}