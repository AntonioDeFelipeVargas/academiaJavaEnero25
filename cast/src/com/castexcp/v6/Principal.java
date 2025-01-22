package com.castexcp.v6;
//Pattern matching

import java.util.Random;

abstract class Ave{
	String tipo = "AVE";
	
	abstract void volar();
	
	void comerAve() {
		System.out.println("Ave Comer");
	}
}

class Pato extends Ave{
	String tipo = "PATO";
	@Override
	void volar(){
		System.out.println("Pato Volar");
	}
	void comerPato() {
		System.out.println("Pato Comer");
	}
}

class Aguila extends Ave{
	String tipo = "AGUILA";
	@Override
	void volar(){
		System.out.println("Aguila Volar");
	}
	void comerAguila() {
		System.out.println("Aguila Comer");
	}
}

class Pinguino extends Ave{
	String tipo = "PINGUINO";
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
		//Instanceof with Patter Matching
		System.out.println("V6");
		Ave ave = getAve();
		
		ave.volar(); //POLIMORFISMO
		
		if (ave instanceof Aguila agui) {
			agui.comerAguila();
			System.out.println(agui.tipo);
		}
		else if (ave instanceof Pinguino pin) {
			pin.comerPinguino();
			System.out.println(pin.tipo);
		}
		else if (ave instanceof Pato pat) {
			pat.comerPato();
			System.out.println(pat.tipo);
		}
		
		ave.comerAve();
		//System.out.println(ave.tipo); //AVE
		
	}

	private static Ave getAve() {
		Ave[] aves = {new Pato(),new Aguila(),new Pinguino()};
		int aleatorio = new Random().nextInt(aves.length);
		Ave ave = aves[aleatorio];
		return ave;
	}

}
