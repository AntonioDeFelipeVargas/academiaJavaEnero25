package com.exception.v6;

public class PrincipalDivision {

	public static void main(String[] args){

		int x = 1000; //x no puede ser mayor a 1000
		int y = 2;
		
		int res;
		try {
			res = dividir(x,y);
			System.out.println("Resultado: "+res);
		} catch (DividirCeroException | DividirNegativoException | UnsupportedOperationException e) {
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
		if (x >= 1000)
			throw new UnsupportedOperationException("El valor de x no puede ser mayor a 1000");
		return x/y;
	}

}
