package com.arrays.v0;

public class PrincipalArrays2 {

	public static void main(String[] args) {

		int[][] orig = { { 1, 2, 3} , { 4, 5, 6, 7}}; 
		int[][] dup = orig; 
		int[] copy = dup[0];  
		
		System.out.println(orig == dup); //true
		System.out.println(orig.equals(dup)); //true
		System.out.println(orig[0] == dup[0]); //true
		System.out.println(dup[0] == copy); //true
		System.out.println(dup[0].equals(copy)); //true  
		
	}

}
