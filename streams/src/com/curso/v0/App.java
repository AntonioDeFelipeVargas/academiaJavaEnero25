package com.curso.v0;

import java.util.stream.Stream;

class App {

	public static void main(String[] args) {

		Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5);

//		nums.filter(n -> n % 2 == 1)
//		    .forEach(p -> System.out.println(p));
		
		//1,3,5
		
		nums.filter(n -> {
			System.out.println("PASO1");
			return n % 2 == 1;
			})
		.forEach(p -> System.out.println(p));
		
		System.out.println("Fin Programa");

	}

}
