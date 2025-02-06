package com.comportamiento.v0;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	//Para ejecutar se necesita una Instancia
	default Predicado<T> and(Predicado<T> pre) {
		return x -> (this.probar(x) && pre.probar(x));
	}
}
