package com.curso.v2;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		try {
			new Principal().fall(11);
		} catch (IOException e) {
			e.printStackTrace();
			//System.out.println("HELLO");
		}
		System.out.println("Fin de Programa");
	}
	
	void fall(int distance) throws IOException {
		if(distance > 10) 
			throw new IOException();
	}

}
