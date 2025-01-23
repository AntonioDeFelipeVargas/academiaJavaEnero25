package com.curso.v9A;

public class Potencia extends OperacionAbs {
	
	public Potencia(int x,int y) {
		super(x,y);
	}
	
	@Override
	public int ejecuta() {
		return (int)(Math.pow(x, y));
	}

}
