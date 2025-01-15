package com.curso.v0;

public class Question06 {
	
	static long addCandy(double fruit, float vegetables) { 
		return (long)((int)fruit+vegetables);
	}

	public static void main(String[] args) {
		
		System.out.print(addCandy(1.4, 2.4f) + ", "); //3
		System.out.print(addCandy(1.9, (float)4) + ", "); //5
		System.out.print(addCandy((long)(int)(short)2, (float)4)); 

		int i = 1;
		float f = 2.0f;
		float x = i + f;
		long res = (long)x;
	}

}
