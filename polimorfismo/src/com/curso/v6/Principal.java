package com.curso.v6;

import java.util.Random;

abstract class Ave{ //No se pueden crear objetos
	abstract void volar(); //No tienen comportamiento
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
		System.out.println("V6");
		Ave ave = getAve();
		ave.volar(); //POLIMORFISMO
	}

	private static Ave getAve() {
		Ave[] aves = {new Pato(),new Aguila(),new Pinguino()};
		int aleatorio = new Random().nextInt(aves.length);
		Ave ave = aves[aleatorio];
		System.out.println(aleatorio);
		System.out.println(ave.getClass().getSimpleName());
		return ave;
	}

}
