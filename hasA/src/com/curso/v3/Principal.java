package com.curso.v3;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		Almacen almacen = new Almacen("Neza");
		
		almacen.setCuenta(new Cuenta(new StringBuilder("cta1"),1));
		almacen.setCuenta(new Cuenta(new StringBuilder("cta2"),2));
		almacen.setCuenta(new Cuenta(new StringBuilder("cta3"),3));
				
		Cuenta cta = almacen.getCuenta(new Cuenta(new StringBuilder("GATITO"),2));

		System.out.println(cta);
		
		cta.setCveCuenta(new StringBuilder("PATITO"));
		
		System.out.println(almacen);
		
	}

}
