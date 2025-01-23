package com.curso.v3;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3");

		List<String> cuentas = new ArrayList<>();
		cuentas.add("AZX123");
		cuentas.add("WZX222");
		cuentas.add("YZX333");
		
		String nombre = "Filologo";
		StringBuilder claveCliente  = new StringBuilder("clave9876");
		
		Cliente cliente1 = 
				new Cliente(nombre,claveCliente,29,false,cuentas);
		
		System.out.println(cliente1);
		
		nombre = nombre.concat("XXXXX");
		
		String hackeo = cliente1.getNombre();
		
		hackeo = hackeo.concat("ZZZZZZ");
		
		System.out.println(cliente1);
		
		



		
		
		
		
		
		
		
		
		
	}

}
