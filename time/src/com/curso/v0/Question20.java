package com.curso.v0;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Question20 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2022, Month.MARCH, 13); 
		LocalTime time = LocalTime.of(1, 30); 
		ZoneId zone = ZoneId.of("US/Eastern"); 
		ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
		
		System.out.println(dateTime1);
		
		ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
		
		System.out.println(dateTime2);
		
		long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
		
		System.out.println(diff);
		
		System.out.println(dateTime1.getOffset());
		System.out.println(dateTime2.getOffset());
		
		boolean offset = dateTime1.getOffset() == dateTime2.getOffset();

		System.out.println(offset);
		
	}

}
