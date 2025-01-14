package com.curso.v3;

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
		System.out.println("V2");
		Ave ave1 = new Pato();
		ave1.volar(); //Pato Volar
		
		Ave ave2 = new Aguila();
		ave2.volar(); //Aguila Volar
		
		Ave ave3 = new Pinguino();
		ave3.volar(); //Pinguino No Volar
	}

}
