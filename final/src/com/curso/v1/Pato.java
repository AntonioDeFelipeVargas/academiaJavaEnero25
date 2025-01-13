package com.curso.v1;

class Ave{
	//final 
	void volar() {
		System.out.println("Volar Ave");
	}
}

public class Pato extends Ave {
	
	@Override
	void volar() {
		System.out.println("Volar Pato");
	}
	
	public static void main(String[] args) {
		Pato pato1 = new Pato();
		pato1.volar(); 
	}
}
