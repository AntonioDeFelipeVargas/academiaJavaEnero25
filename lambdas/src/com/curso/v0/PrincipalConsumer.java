package com.curso.v0;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class PrincipalConsumer {

	public static void main(String[] args) {

		//Definición
		Consumer<String> c1 = s -> System.out.println(s);
		//Ejecución
		c1.accept("Hello");
		
		Consumer<Map<Integer,String>> c2 = s -> System.out.println(s);
		
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "Uno");
		mapa.put(2, "Dos");
		mapa.put(3, "Tres");
		
		c2.accept(mapa);
		
		
		
	}

}
