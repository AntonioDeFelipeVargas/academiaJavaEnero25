package com.curso.v4;

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
		//System.out.println(ave1.tipo);
		System.out.println(((Pinguino)ave1).tipo);

	}

}
