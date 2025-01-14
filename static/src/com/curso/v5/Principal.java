package com.curso.v5;

import com.curso.v3.Pato;
import static com.curso.v3.Pato.*;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("V5");
		System.out.println(contador); //0
		
		Pato pato1 = new Pato("Donald",4);
		Pato pato2 = new Pato("Lucas",3);
		Pato pato3 = new Pato("Patito Feo",2);
		
		System.out.println(getContador()); //3 

	}

}
