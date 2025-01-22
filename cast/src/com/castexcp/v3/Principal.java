package com.castexcp.v3;

import java.util.Random;

//NO SE PUEDE CREAR INSTANCIAS
abstract class Ave{
	String tipo = "Ave";
	
	abstract void volar();
	
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
		System.out.println("V3");
		Ave ave = getAve();
		
		ave.volar(); //POLIMORFISMO
		
		if (ave instanceof Aguila)
			((Aguila)ave).comerAguila();
		else if (ave instanceof Pinguino)
			((Pinguino)ave).comerPinguino();
		else if (ave instanceof Pato)
			((Pato)ave).comerPato();
		
		ave.comerAve();
		
	}

	private static Ave getAve() {
		Ave[] aves = {new Pato(),new Aguila(),new Pinguino()};
		int aleatorio = new Random().nextInt(aves.length);
		Ave ave = aves[aleatorio];
		return ave;
	}

}
