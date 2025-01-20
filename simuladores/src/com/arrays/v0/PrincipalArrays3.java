package com.arrays.v0;

import java.util.Arrays;

public class PrincipalArrays3 {

	public static void main(String[] args) {

		int[][] orig = { { 1, 2, 3} , { 4, 5, 6, 7}}; 
		int[][] dup = orig.clone(); 
		int[] copy = dup[0].clone();  
		
		showArray(orig);
		showArray(dup);

		System.out.println(orig == dup); //false
		System.out.println(orig.equals(dup)); //false
		
		System.out.println(orig[0] == dup[0]); //true
		System.out.println(orig[1] == dup[1]); //true
		System.out.println(dup[0] == copy); //false
		System.out.println(dup[0].equals(copy)); //false  
		
	}
	
	static void showArray(int[][] arregloBi) {
		for (int[] arreglo :arregloBi)
			System.out.println(Arrays.toString(arreglo));
		System.out.println("******");
	}

}
