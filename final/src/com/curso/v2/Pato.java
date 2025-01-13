package com.curso.v2;

class Ave{
	//final 
	static void volar() {
		System.out.println("Volar Ave");
	}
}

public class Pato extends Ave {
	
	static void volar() {
		System.out.println("Volar Pato");
	}
	
	public static void main(String[] args) {
		Pato pato1 = new Pato();
		pato1.volar(); 
	}
}
