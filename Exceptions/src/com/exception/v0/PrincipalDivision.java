package com.exception.v0;

public class PrincipalDivision {

	public static void main(String[] args) {

		int x = 9;
		int y = 0;
		
		int res = dividir(x,y);
		
		System.out.println("Resultado: "+res);
		
		System.out.println("EndProgram");
		
	}

	private static int dividir(int x, int y) {
		return x/y;
	}

}
