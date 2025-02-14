package com.curso.v0;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Principal3 {

	public static void main(String[] args) {

		LocalDateTime fechaHora = 
				LocalDateTime.of(2022, 10, 20, 15, 12, 34);

		DateTimeFormatter dtf = 
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT);
		System.out.println(dtf.format(fechaHora)); // 10/20/22, 3:12 PM (en_US)
		
		DateTimeFormatter dtfIt = dtf.withLocale(new Locale("it", "IT"));
		System.out.println(dtfIt.format(fechaHora)); // 20/10/22, 15:12 (en Italia)
		
		ZoneId zoneId = ZoneId.of("Europe/Madrid");
		ZonedDateTime fechaHoraZoned = ZonedDateTime.of(fechaHora, zoneId); 
		dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.FULL);
		System.out.println(dtf.format(fechaHoraZoned));

		

	}

}
