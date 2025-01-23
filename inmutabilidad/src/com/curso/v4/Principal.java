package com.curso.v4;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4");

		List<String> cuentas = new ArrayList<>();
		cuentas.add("AZX123");
		cuentas.add("WZX222");
		cuentas.add("YZX333");
		
		String nombre = "Filologo";
		StringBuilder claveCliente  = new StringBuilder("clave9876");
		
		Cliente cliente1 = 
				new Cliente(nombre,claveCliente,29,false,cuentas);
		
		System.out.println(cliente1);
		
		cuentas.set(1, "000000");
		List<String> listaHackeo = cliente1.getCuentas();
		listaHackeo.set(1, "000000");
		
		System.out.println(cliente1);
		
		

		
		



		
		
		
		
		
		
		
		
		
	}

}
