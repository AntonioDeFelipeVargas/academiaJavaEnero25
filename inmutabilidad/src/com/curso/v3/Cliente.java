package com.curso.v3;

import java.util.List;
import java.util.Objects;

public final class Cliente {
	
	private final String nombre;
	private final StringBuilder claveCliente;
	private final int edad;
	private final boolean vip;
	private final List<String> cuentas;
	
	public Cliente(String nombre,StringBuilder claveCliente, int edad, boolean vip, List<String> cuentas) {
		this.nombre = nombre;
		this.edad = edad;
		this.vip = vip;
		this.cuentas = cuentas;
		this.claveCliente = new StringBuilder(claveCliente);
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", claveCliente=" + claveCliente + ", edad=" + edad + ", vip=" + vip
				+ ", cuentas=" + cuentas + "]";
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
	
	public StringBuilder getClaveCliente() {
		return new StringBuilder(claveCliente);
	}

	public int getEdad() {
		return edad;
	}

	public boolean isVip() {
		return vip;
	}

	public List<String> getCuentas() {
		return cuentas;
	}
	
}
