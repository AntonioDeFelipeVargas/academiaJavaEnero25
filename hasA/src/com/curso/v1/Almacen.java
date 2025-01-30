package com.curso.v1;

import java.util.List;
import java.util.Objects;

public class Almacen {
	
	//HAS-A
	private String nombre;
	private List<Cuenta> cuentas;

	public Almacen(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + "]";
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
		Almacen other = (Almacen) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

}
