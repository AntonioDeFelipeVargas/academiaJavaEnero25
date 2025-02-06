package com.comportamiento.v6;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	static <Z> Predicado<Z> and(Predicado<Z> pre1,Predicado<Z> pre2) {
		return x -> (pre1.probar(x) && pre2.probar(x));
	}
	
	static <W> Predicado<W> or(Predicado<W> pre1,Predicado<W> pre2) {
		return x -> (pre1.probar(x) || pre2.probar(x));
	}
	
	static <Y> Predicado<Y> negate(Predicado<Y> pre){
		return x -> !pre.probar(x);
	}
	
	static <A> Predicado<A> soyYo(Predicado<A> pre){
		return pre;
	}

	
}
