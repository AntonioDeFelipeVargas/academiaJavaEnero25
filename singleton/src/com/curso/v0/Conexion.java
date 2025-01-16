package com.curso.v0;

public class Conexion {
	
	static private Conexion con;
	
	private Conexion() {
		System.out.println("Paso por Constructor");
	}
	
	static public Conexion getInstance() {
		if (con == null)
			con = new Conexion();
		return con;
	}

}
