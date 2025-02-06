package com.curso.v5;

@FunctionalInterface
public interface Predicado<T> {
	boolean probar(T t);
}
