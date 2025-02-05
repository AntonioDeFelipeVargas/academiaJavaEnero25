package com.curso.v0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

public class PrincipalSuppliers {

	public static void main(String[] args) {

		//Definición Lambda
		Supplier<String> sup1 = () -> "Hola";
		//Ejecución Lambda
		String s1 = sup1.get();
		System.out.println(s1);
		
		Supplier<String> sup0 = () -> {
			System.out.println("Paso por Supplier String");
			String s = "Hello";
			return s;
		};
		
		String s0 = sup0.get();
		System.out.println(s0);
		
		Supplier<Double> sup2 = () -> new Random().nextDouble();
		Double d = sup2.get();
		System.out.println(d);
		
		Supplier<String[]> sup3 =()-> new String[] {"A","B","C"};
		String[] array = sup3.get();
		System.out.println(Arrays.toString(array));
		
		Supplier<Map<Integer,String>> sup4 = () -> {
				System.out.println("PASO POR HashMap");
				Map<Integer,String> map = new HashMap<>();
				map.put(1, "uno");
				map.put(2, "dos");
				map.put(3, "tres");
				return map;
		};
		
		Map<Integer,String> mapa = sup4.get();
		
		System.out.println(mapa);
		
		
		
	}

}
