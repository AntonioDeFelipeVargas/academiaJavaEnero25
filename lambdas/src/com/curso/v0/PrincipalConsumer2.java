package com.curso.v0;

import java.util.*;
import java.util.function.Consumer;

public class PrincipalConsumer2 {

	public static void main(String[] args) {
		
		List<Consumer<String>> listaConsumers = new ArrayList<>();
		
		listaConsumers.add(s -> System.out.println(s));
		listaConsumers.add(s -> {
			s = s.concat(" World");
			System.out.println(s);
		});
		
		for (Consumer<String> cons :listaConsumers) {
			cons.accept("Hello");
		}
		
	}

}
