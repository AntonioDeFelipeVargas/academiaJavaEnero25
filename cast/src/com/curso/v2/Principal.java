package com.curso.v2;

class Ave{
	void volar() {
		System.out.println("Ave Volar");
	}
	void comerAve() {
		System.out.println("Ave Comer");
	}
}

class Pinguino extends Ave{
	@Override
	void volar() {
		System.out.println("Pinguino Volar");
	}
	void comerPinguino() {
		System.out.println("Pinguino Comer");
	}
}


public class Principal {

	public static void main(String[] args) {
		Ave ave0 = new Ave();
		ave0.volar();
		ave0.comerAve();
		
		Ave ave1 = new Pinguino();
		ave1.volar();
		((Pinguino)ave1).comerPinguino(); 
	}

}
