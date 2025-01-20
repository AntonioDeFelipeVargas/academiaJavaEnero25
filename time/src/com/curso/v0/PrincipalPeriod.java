package com.curso.v0;

import java.time.*;

public class PrincipalPeriod {

	public static void main(String[] args) {

		LocalDate start = LocalDate.of(2022, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2022, Month.MARCH, 30);
		Period period = Period.ofMonths(1); // create a period
		performAnimalEnrichment(start, end, period);
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) { // uses the generic
		LocalDate upTo = start;

		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period); 
		}
	}
}
