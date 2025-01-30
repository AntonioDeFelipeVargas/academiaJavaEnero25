package com.curso.v7;

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
		
		Iterator<Cliente> iterator = clientes.iterator();
		
		Cliente cliente = null;
		
		while(iterator.hasNext()) {
			cliente = iterator.next();
			if ("Herodionx".equals(cliente.getNombre()))
				break;
			cliente = null;
		}
		
		System.out.println(cliente);
		
		
	}

}
