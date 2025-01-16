package com.curso.v4;

enum DiaSemana {
	LUNES("low"), //<== Objeto
	MARTES("low"), //<== Objeto
	MIERCOLES("low"), //<== Objeto
	JUEVES("medium"),
	VIERNES("medium"),
	SABADO("high"),
	DOMINGO("high");
	
	private String visitantes;
	
	DiaSemana(String visitantes){
		this.visitantes = visitantes;
	}
	
	String getVisitantes() {
		return visitantes;
	}
}

public class Principal {
	
	public static void main(String[] args) {
		
		for(DiaSemana ds: DiaSemana.values()) {
			System.out.println(ds);
			System.out.println("Visitantes: "+ds.getVisitantes());
			System.out.println("*******");
		}
		
		
	}
}
