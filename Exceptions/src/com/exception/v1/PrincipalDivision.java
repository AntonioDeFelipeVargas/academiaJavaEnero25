package com.exception.v1;

public class PrincipalDivision {

	public static void main(String[] args){

		int x = 9;
		int y = 0;
		
		int res;
		try {
			res = dividir(x,y);
			System.out.println("Resultado: "+res);
		} catch (DividirCeroException e) {
			e.printStackTrace();
		}
		System.out.println("EndProgram");
		
	}

	private static int dividir(int x, int y) throws DividirCeroException {
		if (y == 0)
			throw new DividirCeroException("No se puede dividir entre Cero");
		return x/y;
	}

}
