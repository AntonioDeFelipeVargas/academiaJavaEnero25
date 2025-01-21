package com.curso.v0;

import java.util.*;

public class Principal2 {

	public static void main(String[] args) {

		String[] nombres = {"Patrobas","Tercio","Epeneto","Andronico"};
		System.out.println(Arrays.toString(nombres));
		
//		for(String name:nombres)
//			System.out.println(name);
		
		List<String> listNombres = Arrays.asList(nombres);
		
		ArrayList<String> arrayNombres = 
				new ArrayList<>(Arrays.asList(nombres));
		
		
				
	}

}
