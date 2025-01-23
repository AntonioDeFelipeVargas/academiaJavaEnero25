package com.curso.v0;

import java.util.List;
import java.util.Objects;

public class Cliente {
	
	private String nombre;
	private int edad;
	private boolean vip;
	private List<String> cuentas;
	
	public Cliente(String nombre, int edad, boolean vip) {
		this.nombre = nombre;
		this.edad = edad;
		this.vip = vip;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", vip=" + vip + "]";
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
		return edad == other.edad && Objects.equals(nombre, other.nombre) && vip == other.vip;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public List<String> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<String> cuentas) {
		this.cuentas = cuentas;
	}
	
	
	

}
