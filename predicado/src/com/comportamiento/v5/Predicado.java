package com.comportamiento.v5;


@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	static <T> Predicado<T> and(Predicado<T> pre1,Predicado<T> pre2) {
		return x -> (pre1.probar(x) && pre2.probar(x));
	}
	
	static <T> Predicado<T> or(Predicado<T> pre1,Predicado<T> pre2) {
		return x -> (pre1.probar(x) || pre2.probar(x));
	}
	
	static <T> Predicado<T> negate(Predicado<T> pre){
		return x -> !pre.probar(x);
	}
	
	static <T> Predicado<T> soyYo(Predicado<T> pre){
		return pre;
	}

	
}
