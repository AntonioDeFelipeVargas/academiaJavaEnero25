package com.curso.v4;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Almacen {
	
	//HAS-A
	private String nombre;
	private List<Cuenta> listaCuentas;

	public Almacen(String nombre) {
		this.nombre = nombre;
		listaCuentas = new LinkedList<>();
	}

	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + ", listaCuentas=" + listaCuentas + "]";
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

	public void setCuenta(Cuenta cta) {
		listaCuentas.add(cta);
	}
	
	public Cuenta getCuenta(int numerocuenta) {
		int i = listaCuentas.indexOf(new Cuenta(null,numerocuenta));
		System.out.println("Indice: "+i);
		Cuenta cta = listaCuentas.get(i); //<==
		return new Cuenta(cta.getCveCuenta(),cta.getNumeroCuenta());
		//return cta;
	}

	
	
	
	
}
