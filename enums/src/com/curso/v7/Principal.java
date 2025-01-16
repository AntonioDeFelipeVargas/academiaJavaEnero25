package com.curso.v7;

enum DiaSemana  {
	
	LUNES(){
		@Override
		void ejecutaAbs() {
		}
	}, 
	MARTES(){
		@Override
		void ejecutaAbs() {
		}
		@Override
		String getVisitantes() {
			return "bajo";
		}
	}, 
	MIERCOLES(){
		@Override
		void ejecutaAbs() {
		}
	}, 
	JUEVES("medium"){
		@Override
		void ejecutaAbs() {
		}
	},
	VIERNES("medium"){
		@Override
		void ejecutaAbs() {
		}
	},
	SABADO("high"){
		@Override
		void ejecutaAbs() {
		}
	},
	DOMINGO("high"){
		@Override
		void ejecutaAbs() {
		}
	};
	
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
	
	abstract void ejecutaAbs();
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
