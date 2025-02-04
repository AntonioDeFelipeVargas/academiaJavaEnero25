package com.curso.v0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class Principal {
	
	public static void main(String[] args) {
		
		String[] arrayNames = {"Patrobas","Epeneto","Andronico",
				"Filologo","Herodion", "Urbano", "Tercio"
		};
		
		Predicate<String> pre = s -> !s.endsWith("o");
		
		Stream<String> stream = Arrays.stream(arrayNames);
		
		List<String> lista = 
				stream.filter(pre)
		              .collect(Collectors.toList());
		
		System.out.println(lista);
		
		
	}

}
