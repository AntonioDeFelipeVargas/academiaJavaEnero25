package com.curso.v5;

enum DiaSemana {
	LUNES(), //<== Objeto
	MARTES(), //<== Objeto
	MIERCOLES(), //<== Objeto
	JUEVES("medium"),
	VIERNES("medium"),
	SABADO("high"),
	DOMINGO("high");
	
	private static long capacidad = 1000;
	
	private String visitantes;
	
	DiaSemana(){
		visitantes = "low";
	}
	
	DiaSemana(String visitantes){
		this.visitantes = visitantes;
	}
	
	String getVisitantes() {
		return visitantes;
	}
	
	static long getCapacidad() {
		return capacidad;
	}
}

public class Principal {
	
	public static void main(String[] args) {
		
		for(DiaSemana ds: DiaSemana.values()) {
			System.out.println(ds);
			//System.out.println(ds.visitantes);
			System.out.println("Visitantes: "+ds.getVisitantes());
			System.out.println("*******");
		}
		
		System.out.println("Capacidad Visitantes: "+DiaSemana.getCapacidad());
		
		
	}
}
