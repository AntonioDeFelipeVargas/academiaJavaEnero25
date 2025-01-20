package com.arrays.v0;

import java.util.Arrays;

public class PrincipalArrays1 {
	
	public static void main(String[] args) {
		int[] orig0 = {1,2,3};
		System.out.println(Arrays.toString(orig0));
		
		int[][] orig1 = {{ 1, 2, 3} , { 4, 5, 6, 7}};
		
		for(int[] arreglo : orig1) 
			System.out.print(Arrays.toString(arreglo));
		

		System.out.println("*********");
		int[][] orig2 = new int[2][];
		orig2[0]  = new int[3];
		orig2[0][0] = 1;
		orig2[0][1] = 2;
		orig2[0][2] = 3;
		
		orig2[1]  = new int[4];
		orig2[1][0] = 4;
		orig2[1][1] = 5;
		orig2[1][2] = 6;
		orig2[1][3] = 7;
		
		for(int[] arreglo : orig2) 
			System.out.print(Arrays.toString(arreglo));
		

	}

}
