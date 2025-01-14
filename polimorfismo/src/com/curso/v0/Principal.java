package com.curso.v0;

class Pato{
	void volar(){
		System.out.println("Pato Volar");
	}
}

class Aguila{
	void volar(){
		System.out.println("Aguila Volar");
	}
}

public class Principal {

	public static void main(String[] args) {
		Pato pato = new Pato();
		pato.volar();
		
		Aguila aguila = new Aguila();
		aguila.volar();
	}

}
