package com.curso.v2;

enum DiaSemana {
	LUNES,
	MARTES,
	MIERCOLES,
	JUEVES,
	VIERNES,
	SABADO,
	DOMINGO
}

public class Principal {
	
	public static void main(String[] args) {
		
		DiaSemana ds = DiaSemana.valueOf("VIERNES");
		//ds = DiaSemana.VIERNES;
		
		System.out.println(ds);

	}
	
	
}
