package com.curso.v9;

public class Suma extends OperacionAbs {
	
	public Suma(int x,int y) {
		super(x,y);
	}
	
	@Override
	public int ejecuta() {
		return x+y;
	}
	
	//OVERLOADING
	public double ejecuta(double d1, double d2) {
		return d1+d2;
	}

}
