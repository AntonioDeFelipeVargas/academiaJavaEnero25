package com.castexcp.v7;
import java.util.Random;

interface Ave{
	//public static final
	String tipo = "AVE INTERFACE";
	
	//public abstract
	void volar();
	
	//Métodos con comportamiento a partir JAVA8
	//static ó default
//	void comerAve() {
//		System.out.println("Ave Comer");
//	}
}
//public,protected,default*,private

class Pato implements Ave{
	String tipo = "PATO";
	@Override
	public void volar(){
		System.out.println("Pato Volar");
	}
	void comerPato() {
		System.out.println("Pato Comer");
	}
}

class Aguila implements Ave{
	String tipo = "AGUILA";
	@Override
	public void volar(){
		System.out.println("Aguila Volar");
	}
	void comerAguila() {
		System.out.println("Aguila Comer");
	}
}

class Pinguino implements Ave{
	String tipo = "PINGUINO";
	@Override
	public void volar(){
		System.out.println("Pinguino No Volar");
	}
	void comerPinguino() {
		System.out.println("Pinguino Comer");
	}
}

public class Principal {

	public static void main(String[] args) {
		System.out.println("V7");
		
		System.out.println(Ave.tipo); 
		
		Ave ave = getAve();
		
		ave.volar(); //POLIMORFISMO
		
		if (ave instanceof Aguila) {
			((Aguila)ave).comerAguila();
			System.out.println(((Aguila)ave).tipo);
		}
		else if (ave instanceof Pinguino) {
			((Pinguino)ave).comerPinguino();
			System.out.println(((Pinguino)ave).tipo);
		}
		else if (ave instanceof Pato) {
			((Pato)ave).comerPato();
			System.out.println(((Pato)ave).tipo);
		}
		
	}

	private static Ave getAve() {
		Ave[] aves = {new Pato(),new Aguila(),new Pinguino()};
		int aleatorio = new Random().nextInt(aves.length);
		Ave ave = aves[aleatorio];
		return ave;
	}

}
