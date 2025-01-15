package com.instanceof0;

import java.util.Random;

class Ave{
	void volar(){
		System.out.println("Ave Volar");
	}
}

class Pato extends Ave{
	@Override
	void volar(){
		System.out.println("Pato Volar");
	}
}

class Aguila extends Ave{
	@Override
	void volar(){
		System.out.println("Aguila Volar");
	}
}

class Pinguino extends Ave{
	@Override
	void volar(){
		System.out.println("Pinguino No Volar");
	}
}

public class Principal {

	public static void main(String[] args) {
		System.out.println("V0");
		Ave ave = getAve();
		
		if (ave instanceof Aguila)
			System.out.println("Tetracampeones");
		else if (ave instanceof Pinguino)
			System.out.println("Soy un Pinguino");
		
		ave.volar(); //POLIMORFISMO
	}

	private static Ave getAve() {
		Ave[] aves = {new Pato(),new Aguila(),new Ave(),new Pinguino()};
		int aleatorio = new Random().nextInt(aves.length);
		Ave ave = aves[aleatorio];
		return ave;
	}

}
