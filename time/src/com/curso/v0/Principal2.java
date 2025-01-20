package com.curso.v0;

import java.time.LocalDate;
import java.time.Month;

public class Principal2 {

	public static void main(String[] args) {
		
//		String cadena = "Hola"; //INMUTABLE
//		cadena = cadena.concat("Mundo");
//		System.out.println(cadena);

		LocalDate date = LocalDate.of(2022, Month.JANUARY, 20);
		date = date.plusDays(2);
		System.out.println(date);
		
	}

}
