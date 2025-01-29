package com.curso.v0;

import java.util.*;

public class PrincipalStringBuilder2 {
	
	public static void main(String[] args) {
		
		StringBuilder nombreAristobulo = new StringBuilder("Aristobulo");
		StringBuilder nombrePatrobas = new StringBuilder("Patrobas");
		
		StringBuilder[] arrayNombres = {
				nombrePatrobas,
				new StringBuilder("Filologo"),
				new StringBuilder("Tercio"),
				new StringBuilder("Herodion"),
				nombreAristobulo,
				nombrePatrobas};
		
		Set<StringBuilder> setNombres = new HashSet<>(Arrays.asList(arrayNombres));
		
		setNombres.remove(nombreAristobulo);
		
		for (StringBuilder name:setNombres)
			System.out.println(name);
		
	}

}
