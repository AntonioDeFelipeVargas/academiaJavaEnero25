package com.curso.v2;

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
		System.out.println("V2");
		Ave ave1 = new Pato();
		ave1.volar(); //Pato Volar
		
		Ave ave2 = new Aguila();
		ave2.volar(); //Aguila Volar
	}

}
