package com.curso.v0;

import java.time.*;

public class Question14 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); 
		LocalTime time = LocalTime.now(); 
		LocalDateTime dateTime = LocalDateTime.now(); 
		//System.out.println(dateTime);
		ZoneId zoneId = ZoneId.systemDefault(); 
		ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
		//System.out.println(zonedDateTime);
		
		Instant instant = zonedDateTime.toInstant();
		System.out.println(instant);
		
		System.out.println(Instant.now());
		
//		System.out.println(Instant.now());
//		time.toInstant();
//		System.out.println(time.toInstant();
//		

		
	}
}
