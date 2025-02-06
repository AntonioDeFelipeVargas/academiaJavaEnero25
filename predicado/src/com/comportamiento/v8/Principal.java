package com.comportamiento.v8;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		
		boolean b;
		
		System.out.println("StringBuilder Predicate");
		Predicate<StringBuilder> pre1 = 
				Predicate.isEqual(new StringBuilder("Python"));
		b = pre1.test(new StringBuilder("Python"));
		System.out.println("StringBuilder: "+b);
		
		System.out.println("String Predicate");
		Predicate<String> pre2 = 
				Predicate.isEqual(new String("Python"));
		b = pre2.test("Python");
		System.out.println("String: "+b);
		
	}

}
