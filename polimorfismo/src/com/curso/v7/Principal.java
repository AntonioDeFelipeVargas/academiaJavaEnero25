package com.curso.v7;

import java.util.Random;

interface Ave{ //No se pueden crear objetos
	void volar(); //No tienen comportamiento
}

class Pato implements Ave{
	@Override
	public void volar(){
		System.out.println("Pato Volar");
	}
}

class Aguila implements Ave{
	@Override
	public void volar(){
		System.out.println("Aguila Volar");
	}
}

class Perico implements Ave{
	@Override
	public void volar(){
		System.out.println("Perico Volar");
	}
}

class Pinguino implements Ave{
	@Override
	public void volar(){
		System.out.println("Pinguino No Volar");
	}
}

public class Principal {

	public static void main(String[] args) {
		System.out.println("V7");
		Ave ave = getAve();
		System.out.println(ave.getClass().getSimpleName());
		ave.volar(); //POLIMORFISMO
	}

	private static Ave getAve() {
		Ave[] aves = {new Pato(),new Aguila(),new Perico(),new Pinguino()};
		int aleatorio = new Random().nextInt(aves.length);
		Ave ave = aves[aleatorio];
		System.out.println(aleatorio);
		return ave;
	}

}
