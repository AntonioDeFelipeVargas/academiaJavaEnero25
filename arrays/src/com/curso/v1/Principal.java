package com.curso.v1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		int i = Arrays.compare(new int[] {1,2}, new int[] {1,1});

		//System.out.println(i);
		
		i = Arrays.compare(new String[] {null}, new String[] {""});

		System.out.println(i);
	}
	

}
