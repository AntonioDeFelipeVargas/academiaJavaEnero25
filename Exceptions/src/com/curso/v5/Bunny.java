package com.curso.v5;

public class Bunny {
	
	public static void main(String[] args) {
		try {
			eatCarrot();
		} catch (NoMoreCarrotsException e) {
			e.printStackTrace();
		}
	}

	private static void eatCarrot() throws NoMoreCarrotsException {
		
	}
}
