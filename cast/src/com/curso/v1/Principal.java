package com.curso.v1;

class Ave{
	void volar() {
		System.out.println("Ave Volar");
	}
	void comerAve() {
		System.out.println("Ave Comer");
	}
//	void comerPinguino() {
//		System.out.println("Ave Pinguino Comer");
//	}
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
		//ave1.comerPinguino(); //NO SE PUEDE
		
	}

}
