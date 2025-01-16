package com.curso.v0;

import java.time.DayOfWeek;

public class Question10 {
	
	private DayOfWeek getWeekDay(int day, final int thursday) {
		
		int otherDay = day;
		final int Sunday = 0;
		final int jueves = 99;
		
		switch(otherDay) {
			default:
			case 1: return DayOfWeek.MONDAY; //1
			//case thursday: return DayOfWeek.THURSDAY; //2
			case jueves:
			case 2,10: break; 
			case Sunday: return DayOfWeek.SUNDAY; //3
			//case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;//4
		}
				
		
	}
	
	public static void main(String[] args) {
		
	}

}
