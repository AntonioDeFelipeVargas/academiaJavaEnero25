package com.curso.v1;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		Almacen almacen = new Almacen("Neza");
		
		Cuenta cta1 = new Cuenta(new StringBuilder("cta1"),1);
		Cuenta cta2 = new Cuenta(new StringBuilder("cta2"),2);
		Cuenta cta3 = new Cuenta(new StringBuilder("cta3"),3);
		
		List<Cuenta> lista = new LinkedList<>();
		lista.add(cta1);
		lista.add(cta2);
		lista.add(cta3);
		
		almacen.setCuentas(lista);
		
		System.out.println(almacen);
		for (Cuenta cta: almacen.getCuentas())
			System.out.println(cta);
		
		almacen = null;
		System.out.println(almacen);
		
		for (Cuenta cta: lista)
			System.out.println(cta);

		
		
	}

}
