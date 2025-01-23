package com.curso.v1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		List<String> cuentas = new ArrayList<>();
		cuentas.add("AZX123");
		cuentas.add("WZX222");
		cuentas.add("YZX333");
		
		StringBuilder claveCliente  = new StringBuilder("clave9876");
		
		Cliente cliente1 = 
				new Cliente("Filologo",claveCliente,29,false,cuentas);
		
		System.out.println(cliente1);
		
		claveCliente.append("99999");
		
		System.out.println(cliente1);

		
		
		
		
		
		
		
		
		
	}

}
