package com.curso.v0;

import java.util.*;

public class Principal5 {

	public static void main(String[] args) {
		
		String[] nombres = {"Patrobas","Tercio","Epeneto","Andronico"};
		
		List<String> listNombres = new ArrayList<>(Arrays.asList(nombres));
		
		listNombres.add("Filologo");
		listNombres.remove("Tercio");
		
		//listNombres.set(1, "Filologo");
		
		System.out.println(listNombres);
		
				
	}

}
