package com.curso.v3;

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
		
		for (DiaSemana ds : DiaSemana.values()){
			String nombre = ds.name();
			System.out.println(nombre);
			int i = ds.ordinal();
			System.out.println(i);
			System.out.println("****");
		}
	}
}
