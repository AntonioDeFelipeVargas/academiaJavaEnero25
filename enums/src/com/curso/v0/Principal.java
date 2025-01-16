package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		DiaSemana diaPago = DiaSemana.VIERNES;
		System.out.println("Dia Pago: "+diaPago);
		
		int i = getDia(diaPago);
		
		System.out.println("int: "+i); //4
		
	}
	
	static int getDia(DiaSemana ds) {
		
		int res = 0;
		
		switch(ds) {
			case DOMINGO: res=1; break;
			case LUNES: res=2; break;
			case MARTES: res=3; break;
			case VIERNES: res=4; break;
			case SABADO: res=5; break;
			default: res = 0;
		}
		
		return res;
	}

}
