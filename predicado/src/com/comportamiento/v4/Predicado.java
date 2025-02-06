package com.comportamiento.v4;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	static <T> Predicado<T> and(Predicado<T> pre1,Predicado<T> pre2) {
		return x -> (pre1.probar(x) && pre2.probar(x));
	}
	

	
}
