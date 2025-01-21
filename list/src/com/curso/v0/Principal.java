package com.curso.v0;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		String[] array = new String[] {"a", "b", "c"};
		
		List<String> asList = Arrays.asList(array);
		
		array[1] = "z";
		
		System.out.println(asList); //a,z,c
		
		asList.add("d");
		
	}

}
