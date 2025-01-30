package com.curso.v4;

public class Principal {
	
	public static void main(String[] args) {
		Almacen almacen = new Almacen("Neza");
		
		almacen.setCuenta(new Cuenta(new StringBuilder("cta1"),1));
		almacen.setCuenta(new Cuenta(new StringBuilder("cta2"),2));
		almacen.setCuenta(new Cuenta(new StringBuilder("cta3"),3));
		almacen.setCuenta(new Cuenta(new StringBuilder("cta4"),4));

		Cuenta cta = almacen.getCuenta(100);

		System.out.println(cta);
		
//		cta.setCveCuenta(new StringBuilder("PATITO"));
//		
//		System.out.println(almacen);
		
	}

}
