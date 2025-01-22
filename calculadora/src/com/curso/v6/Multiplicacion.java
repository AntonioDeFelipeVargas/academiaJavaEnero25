package com.curso.v6;

public class Multiplicacion extends Operacion {
	
	public Multiplicacion(int x,int y) {
		super(x,y);
	}
	
	@Override
	int ejecuta() {
		return x*y;
	}

}
