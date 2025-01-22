package com.curso.v5;

class Ave{
	
	String tipo = "AVE";
	
	void volar() {
		System.out.println("Ave Volar");
	}
	void comerAve() {
		System.out.println("Ave Comer");
	}
}

class Pinguino extends Ave{
	
	String tipo = "PINGUINO";  //HIDDEN
	
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
		
		Pinguino pin = (Pinguino)ave1;
		
		System.out.println(pin.tipo);

	}

}
