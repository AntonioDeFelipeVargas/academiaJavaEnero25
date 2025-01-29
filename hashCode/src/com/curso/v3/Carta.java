package com.curso.v3;

import java.util.Objects;

public class Carta {
	
	private String value;
	private String suit;
	
	public Carta(String value, String suit) {
		this.value = value;
		this.suit = suit;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(suit, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(suit, other.suit) && Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "Carta [value=" + value + ", suit=" + suit + "]";
	}


}
