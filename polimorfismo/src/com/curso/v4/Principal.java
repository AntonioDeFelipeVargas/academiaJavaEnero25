package com.curso.v4;

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
		
		Ave ave;
		
		ave = new Pato();
		ave.volar(); //Pato Volar
		
		ave = new Aguila();
		ave.volar(); //Aguila Volar

		ave = new Pinguino();
		ave.volar(); //Pinguino No Volar
	}

}
