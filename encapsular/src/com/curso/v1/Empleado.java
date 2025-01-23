package com.curso.v1;

public class Empleado {
	
	private String nombre;
	private int edad;
	private boolean vip;
	
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		//SI TIENES EL ROL DE ADMIN, SI LO PUEDES VER
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 15)
			throw new RuntimeException("Edad no valida");
		this.edad = edad;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	
	

}
