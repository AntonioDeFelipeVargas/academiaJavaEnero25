package com.curso.v1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		String[] arreglo = {"a", "A", new String("a"), "1", "ab"};
		
		Set<String> set = new TreeSet<>(Arrays.asList(arreglo));
		
		System.out.println(set);
	}

}
