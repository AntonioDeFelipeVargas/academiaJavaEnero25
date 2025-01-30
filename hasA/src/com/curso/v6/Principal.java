package com.curso.v6;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		Set<Cliente> clientes = new HashSet<>();
		clientes.add(new Cliente("Patrobas"));
		clientes.add(new Cliente("Herodion"));
		clientes.add(new Cliente("Urbano"));
		clientes.add(new Cliente("Nereo"));
		
		Almacen almacen = new Almacen("Neza",clientes);
		
		almacen.setCuenta(new Cuenta(new StringBuilder("cta1"),1));
		almacen.setCuenta(new Cuenta(new StringBuilder("cta2"),2));
		almacen.setCuenta(new Cuenta(new StringBuilder("cta3"),3));
		almacen.setCuenta(new Cuenta(new StringBuilder("cta4"),4));

		System.out.println(almacen);
		
		almacen = null;
		
		System.out.println(almacen);
		System.out.println(clientes);

		
	}

}
