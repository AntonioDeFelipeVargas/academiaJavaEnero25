package com.bloques.v0;

class Estudiante{
	
	{
		System.out.println("Estudiar 1");
	}
	
	Estudiante(){
		{
			System.out.println("Paso por constructor 3");
		}
	}
	
	{
		System.out.println("Estudiar 2");
	}

}

public class Principal {
	
	public static void main(String[] args) {
		Estudiante est1 = new Estudiante();
		Estudiante est2 = new Estudiante();
		{
			System.out.println("Fin Programa");
		}
	}

}
