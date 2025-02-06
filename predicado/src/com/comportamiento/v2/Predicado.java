package com.comportamiento.v2;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	default  Predicado<T> and(Predicado<T> pre) {
		return x -> (this.probar(x) && pre.probar(x));
	}
	
	default  Predicado<T> or(Predicado<T> pre) {
		return x -> (this.probar(x) || pre.probar(x));
	}
	
	default  Predicado<T> negate() {
		return x -> !this.probar(x);
	}
	
}
