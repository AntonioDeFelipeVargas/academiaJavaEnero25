package com.arrays.v0;

public class PrincipalArrays0 {

	public static void main(String[] args) {
		int[][] orig0 = new int[][]{ { 1, 2, 3} , { 4, 5, 6, 7}};
		int[][] orig1 = new int[][]{ { 1, 2, 3} , { 4, 5, 6, 7}};
		int[][] orig2 = new int[2][];
		int[][] orig = { { 1, 2, 3} , { 4, 5, 6, 7}}; 
		int[][] dup = orig; 
		int[] copy = dup[0];  
		
		System.out.println(orig == dup); 
		System.out.println(orig.equals(dup)); 
		System.out.println(orig[0] == dup[0]); 
		System.out.println(dup[0] == copy); 
		System.out.println(dup[0].equals(copy));   
	}

}
