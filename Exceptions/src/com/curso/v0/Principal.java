package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		new Principal().fall(11);
		System.out.println("Fin de Programa");
	}
	
	void fall(int distance) {
		if(distance > 10) 
			throw new UnsupportedOperationException("Distance > 10");
			//System.out.println("distance mayor a 10");
	}

}
