package com.curso.v0;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.Month;
import java.time.DayOfWeek;

public class Principal {

	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		
		Month mesOferta = Month.JANUARY;
		System.out.println(mesOferta);
		
		for(DayOfWeek day : DayOfWeek.values())
			System.out.println(day);
		
		//LocalDate d = new LocalDate(1,2,2000);
		
		LocalDate d = LocalDate.of(2022, Month.FEBRUARY, 30);
		System.out.println(d); //java.time.DateTimeException
		
		
	}

}
