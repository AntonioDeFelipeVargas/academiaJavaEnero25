package com.curso.v1;

import java.util.Arrays;

public class Principal3 {

	public static void main(String[] args) {

		System.out.println(
				Arrays.mismatch(new int[] { 1 }, new int[] { 1 })); //-1
		System.out.println(Arrays.mismatch(new String[] { "a" },
						new String[] { "A" })); //0

		System.out.println(Arrays.mismatch(new Integer[] { 1, null,3 }, 
				new Integer[] { 1 ,null,3,4})); //3
	}

}
