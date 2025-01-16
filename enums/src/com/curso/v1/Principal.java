package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		DiaSemana[] dias = DiaSemana.values();
		System.out.println(dias[0]);
		
		for(DiaSemana ds : DiaSemana.values()) {
			System.out.println("Dia de la Semana: "+ds);
		}

	}
	
	
}
