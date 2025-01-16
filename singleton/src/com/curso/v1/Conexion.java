package com.curso.v1;

public class Conexion {
	
	static private Conexion con = new Conexion();
	
	private Conexion() {
		System.out.println("Paso por Constructor");
	}
	
	static public Conexion getInstance() {
		return con;
	}

}
