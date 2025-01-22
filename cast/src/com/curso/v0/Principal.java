package com.curso.v0;

class Ave{
	void volar() {
		System.out.println("Volar Ave");
	}
}

class Pinguino extends Ave{
	@Override
	void volar() {
		System.out.println("Pinguino Ave");
	}
}


public class Principal {

	public static void main(String[] args) {

		Ave ave0 = new Ave();
		ave0.volar();
		
		Ave ave1 = new Pinguino();
		ave1.volar();
		
	}

}
