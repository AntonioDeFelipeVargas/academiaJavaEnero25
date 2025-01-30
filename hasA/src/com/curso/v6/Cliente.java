package com.curso.v6;

import java.util.Objects;

public class Cliente {
	
	private String nombre;

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
