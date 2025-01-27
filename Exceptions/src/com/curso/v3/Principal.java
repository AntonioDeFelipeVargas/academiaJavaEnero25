package com.curso.v3;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException  {
		new Principal().fall(11);
		System.out.println("Fin de Programa");
	}
	
	void fall(int distance) throws IOException {
		if(distance > 10) 
			throw new IOException();
	}

}
