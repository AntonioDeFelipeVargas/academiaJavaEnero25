package com.curso.v4;

import java.io.IOException;

public class Principal {

	public static void main(String[] args){
		new Principal().fall(11);
		System.out.println("Fin de Programa");
	}
	
	void fall(int distance) {
		try {
			if(distance > 10) 
				throw new IOException();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
