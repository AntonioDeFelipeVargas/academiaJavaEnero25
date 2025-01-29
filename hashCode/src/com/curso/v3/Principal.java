package com.curso.v3;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Carta corazon7 = new Carta("7","Corazon");
		Carta corazon4 = new Carta("4","Corazon");
		Carta corazonOtro4 = new Carta("4","Corazon");
		Carta diamante4 = new Carta("4","Diamante");
		Carta diamante7 = new Carta("7","Diamante");
		
		System.out.println(corazon4.equals(corazonOtro4)); //true
		
		List<Carta> lista = List.of(corazon7,corazon4,corazonOtro4,diamante4,diamante7);
		
		Set<Carta> setCartas = new HashSet<>(lista);
		
		setCartas.remove(new Carta("7","Diamante"));
		
		setCartas.forEach(x -> System.out.println(x));
		

	}

}
