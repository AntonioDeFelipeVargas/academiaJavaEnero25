package com.curso.v1;

class Ave{
	void volar(){
		System.out.println("Ave Volar");
	}
}

class Pato extends Ave{
	@Override
	void volar(){
		System.out.println("Pato Volar");
	}
}

class Aguila extends Ave{
	@Override
	void volar(){
		System.out.println("Aguila Volar");
	}
}

public class Principal {

	public static void main(String[] args) {
		Pato pato = new Pato();
		pato.volar(); //Pato Volar
		
		Aguila aguila = new Aguila();
		aguila.volar(); //Aguila Volar
	}

}
