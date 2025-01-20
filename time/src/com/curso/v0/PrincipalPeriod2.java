package com.curso.v0;

import java.time.*;

public class PrincipalPeriod2 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2024, Month.JANUARY, 20); 
		LocalTime time = LocalTime.of(5, 15); 
		LocalDateTime dateTime = LocalDateTime.of(date, time)
					.minusDays(1) //Métodos de Instancia de Clase
					.minusHours(10) //Métodos de Instancia de Clase
					.minusSeconds(30); //Métodos de Instancia de Clase
		
		//System.out.println(dateTime); 
		//2024-01-18T19:14:30
		
		Period wrong = Period.ofYears(1)  //Métodos de Clase
							 .ofWeeks(1); //Métodos de Clase
		
		System.out.println(wrong);
		
		Period wrong1 = Period.ofYears(1); 
		wrong1 = Period.ofWeeks(1);
//		
//		System.out.println(wrong1);

	}

}