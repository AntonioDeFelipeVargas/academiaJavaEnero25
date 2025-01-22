package com.castexcp.v1;

import java.util.Random;

class Ave{
	String tipo = "Ave";
	void volar(){
		System.out.println("Ave Volar");
	}
	void comerAve() {
		System.out.println("Ave Comer");
	}
}

class Pato extends Ave{
	String tipo = "Pato";
	@Override
	void volar(){
		System.out.println("Pato Volar");
	}
	void comerPato() {
		System.out.println("Pato Comer");
	}
}

class Aguila extends Ave{
	String tipo = "Aguila";
	@Override
	void volar(){
		System.out.println("Aguila Volar");
	}
	void comerAguila() {
		System.out.println("Aguila Comer");
	}
}

class Pinguino extends Ave{
	String tipo = "Pinguino";
	@Override
	void volar(){
		System.out.println("Pinguino No Volar");
	}
	void comerPinguino() {
		System.out.println("Pinguino Comer");
	}
}

public class Principal {

	public static void main(String[] args) {
		System.out.println("V1");
		Ave ave = getAve();
		
		ave.volar(); //POLIMORFISMO
		
		if (ave instanceof Aguila)
			((Aguila)ave).comerAguila();
		else if (ave instanceof Pinguino)
			((Pinguino)ave).comerPinguino();
		else if (ave instanceof Pato)
			((Pato)ave).comerPato();
		
	}

	private static Ave getAve() {
		Ave[] aves = {new Pato(),new Aguila(),new Ave(),new Pinguino()};
		int aleatorio = new Random().nextInt(aves.length);
		Ave ave = aves[aleatorio];
		return ave;
	}

}
