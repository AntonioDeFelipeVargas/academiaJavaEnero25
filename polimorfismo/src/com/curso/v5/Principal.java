package com.curso.v5;

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
		System.out.println("V4");
		Ave ave = getAve();
		ave.volar(); //POLIMORFISMO
	}

	private static Ave getAve() {
		Ave[] aves = {new Pato(),new Aguila(),new Ave(),new Pinguino()};
		int aleatorio = new Random().nextInt(aves.length);
		Ave ave = aves[aleatorio];
		System.out.println(aleatorio);
		System.out.println(ave.getClass().getSimpleName());
		return ave;
	}

}
