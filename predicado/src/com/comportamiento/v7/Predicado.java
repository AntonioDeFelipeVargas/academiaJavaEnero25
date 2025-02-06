package com.comportamiento.v7;

import java.util.Objects;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	static <T> Predicado<T> isEqual(Object targetRef){
		return x -> Objects.equals(x, targetRef);
	}

	
}
