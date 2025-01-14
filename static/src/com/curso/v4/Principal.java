package com.curso.v4;

import com.curso.v3.Pato;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println(Pato.contador); //0
		
		Pato pato1 = new Pato("Donald",4);
		Pato pato2 = new Pato("Lucas",3);
		Pato pato3 = new Pato("Patito Feo",2);
		
		System.out.println(Pato.getContador()); //3 

	}

}
