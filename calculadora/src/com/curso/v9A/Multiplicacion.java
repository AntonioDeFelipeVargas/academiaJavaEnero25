package com.curso.v9A;

public class Multiplicacion extends OperacionAbs {
	
	public Multiplicacion(int x,int y) {
		super(x,y);
	}
	
	@Override
	public int ejecuta() {
		return x*y;
	}

}