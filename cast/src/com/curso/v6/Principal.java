package com.curso.v6;

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
		
		Pinguino pin = new Pinguino();
		
		//UPCASTING
		Ave ave0 = (Ave)pin;
		Ave ave1 = pin; //CAST IMPLICITO

	}

}
