package com.curso.v0;

import java.util.*;

public class PrincipalStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder[] arrayNombres = {
				new StringBuilder("Patrobas"),
				new StringBuilder("Filologo"),
				new StringBuilder("Tercio"),
				new StringBuilder("Herodion"),
				new StringBuilder("Aristobulo"),
				new StringBuilder("Patrobas")};
		
		Set<StringBuilder> setNombres = new HashSet<>(Arrays.asList(arrayNombres));
		
		setNombres.remove(new StringBuilder("Aristobulo"));
		
		for (StringBuilder name:setNombres)
			System.out.println(name);
		
	}

}
