package com.curso.v0;

import java.util.Arrays;

public class Estudiante implements Comparable<Estudiante> {
	
	public static void main(String[] args) {
		Estudiante[] ests = new Estudiante[4];
		ests[0] = new Estudiante();
		ests[1] = new Estudiante();
		ests[2] = new Estudiante();
		ests[3] = new Estudiante();

		Arrays.sort(ests);
		
		System.out.println("Fin de Programa");
	}

	@Override
	public int compareTo(Estudiante o) {
		return 0;
	}

}
