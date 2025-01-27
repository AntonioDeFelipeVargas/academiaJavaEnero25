package com.exception.v2;

public class PrincipalDivision {

	public static void main(String[] args){

		int x = 9;
		int y = 3;
		
		int res;
		try {
			res = dividir(x,y);
			System.out.println("Resultado: "+res);
		} catch (DividirCeroException e) {
			e.printStackTrace();
		} catch (DividirNegativoException e) {
			e.printStackTrace();
		} finally {
			System.out.println("PASO FINALLY");
		}
		System.out.println("EndProgram");
		
	}

	private static int dividir(int x, int y) 
			throws DividirCeroException, DividirNegativoException {
		if (y == 0)
			throw new DividirCeroException("No se puede dividir entre Cero");
		if (y < 0)
			throw new DividirNegativoException("No se puede dividir entre Negativos");
		return x/y;
	}

}
