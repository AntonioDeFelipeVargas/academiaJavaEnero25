package com.curso.v3;

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
		
		Ave ave1 = new Pinguino();
		ave1.volar();
		
		//DOWNCASTING
		Pinguino pin = (Pinguino)ave1;
		pin.comerPinguino();
		
		//((Pinguino)ave1).comerPinguino(); 
	}

}
