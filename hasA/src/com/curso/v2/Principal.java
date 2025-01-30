package com.curso.v2;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		Almacen almacen = new Almacen("Neza");
		
		almacen.setCuenta(new Cuenta(new StringBuilder("cta1"),1));
		almacen.setCuenta(new Cuenta(new StringBuilder("cta2"),2));
		almacen.setCuenta(new Cuenta(new StringBuilder("cta3"),3));
		
		System.out.println(almacen);

		almacen = null;
		
		System.out.println(almacen);

		
		
	}

}
