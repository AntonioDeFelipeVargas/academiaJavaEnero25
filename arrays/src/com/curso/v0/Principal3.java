package com.curso.v0;

import java.util.*;

public class Principal3 {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Patrobas");
		nombres.add("Tercio");
		nombres.add("Epeneto");
		nombres.add("Andronico");
		nombres.add("Filologo");

		//System.out.println(nombres);
		
		//for(String nom : nombres)
			//System.out.println(nom);
		
		Object[] arrayObject = nombres.toArray();
		
		String[] arrayString = nombres.toArray(new String[0]);
		
		//Java Functional
		//String[] arrayString = nombres.toArray(String[]::new);
		
		System.out.println(Arrays.toString(arrayString));
		
		//Java Functional
		//nombres.forEach(System.out::println);
		
		
				
	}

}
