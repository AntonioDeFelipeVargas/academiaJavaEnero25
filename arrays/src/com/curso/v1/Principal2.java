package com.curso.v1;

import java.util.Arrays;

public class Principal2 {

	public static void main(String[] args) {
		String[] names1 = {"Patrobas","Filologo"};
		String[] names2 = {"Patrobas","Filologo"};
		
		System.out.println(names1.equals(names2)); //false
		System.out.println(Arrays.equals(names1,names2)); //true
		
	}

}
