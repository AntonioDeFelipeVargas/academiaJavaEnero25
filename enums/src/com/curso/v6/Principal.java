package com.curso.v6;

enum DiaSemana {
	
	LUNES(), 
	MARTES(){
		@Override
		String getVisitantes() {
			return "bajo";
		}
	}, 
	MIERCOLES(), 
	JUEVES("medium"),
	VIERNES("medium"),
	SABADO("high"),
	DOMINGO("high");
	
	private String visitantes;

	private static long capacidad = 1000;
		
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
