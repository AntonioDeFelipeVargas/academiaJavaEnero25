package com.curso.v0;

import java.util.*;

public class PrincipalString {
	
	public static void main(String[] args) {
		
		String[] arrayNombres = {new String("Patrobas"),
						"Filologo",
						"Tercio",
						"Herodion",
						"Aristobulo",
						"Patrobas"};
		
		Set<String> setNombres = new HashSet<>(Arrays.asList(arrayNombres));
		
		setNombres.remove(new String("Aristobulo"));
		
		for (String name:setNombres)
			System.out.println(name);
		
	}

}
