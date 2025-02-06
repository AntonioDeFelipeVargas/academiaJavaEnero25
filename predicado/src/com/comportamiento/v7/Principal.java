package com.comportamiento.v7;

public class Principal {

	public static void main(String[] args) {
		
		boolean b;
		
		System.out.println("StringBuilder");
		Predicado<StringBuilder> pre1 = 
				Predicado.isEqual(new StringBuilder("Python"));
		b = pre1.probar(new StringBuilder("Python"));
		System.out.println("StringBuilder: "+b);
		
		System.out.println("String");
		Predicado<String> pre2 = 
				Predicado.isEqual(new String("Python"));
		b = pre2.probar("Python");
		System.out.println("String: "+b);
		
	}

}
