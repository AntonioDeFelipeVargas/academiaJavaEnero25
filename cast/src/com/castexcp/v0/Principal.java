package com.castexcp.v0;

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
class Pato extends Ave{
	String tipo = "PATO";  
	@Override
	void volar() {
		System.out.println("Pato Volar");
	}
	void comerPato() {
		System.out.println("Pato Comer");
	}
}


public class Principal {

	public static void main(String[] args) {
		
		Pato pato = new Pato();
		
		Ave ave = pato; //UPCASTING
		
		Pinguino pin = (Pinguino)ave; //DOWNCASTING
		
		pin.comerPinguino(); //ClassCastException
		

	}

}
