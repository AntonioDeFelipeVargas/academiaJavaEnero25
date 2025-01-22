package com.curso.v9;

public class Multiplicacion extends OperacionAbs {
	
	public Multiplicacion(int x,int y) {
		super(x,y);
	}
	
	@Override
	public int ejecuta() {
		return x*y;
	}

}