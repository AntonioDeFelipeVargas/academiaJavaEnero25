package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		try{
			new Principal().fall(11);
		}
		catch(UnsupportedOperationException e) {
			System.out.println(e);
		}
		
		System.out.println("Fin de Programa");
	}
	
	void fall(int distance) throws UnsupportedOperationException {
		if(distance > 10) 
			throw new UnsupportedOperationException("Distance > 10");
	}

}
