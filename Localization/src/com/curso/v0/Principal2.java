package com.curso.v0;

import java.text.NumberFormat;
import java.util.Locale;

public class Principal2 {
	
	public static void main(String[] args) {
		NumberFormat compUs = 
				NumberFormat.getCompactNumberInstance
				         (Locale.US, NumberFormat.Style.LONG);
		
		System.out.println(compUs.format(7_123_456_123_456L)); 
		
		compUs = 
				NumberFormat.getCompactNumberInstance
				         (Locale.US, NumberFormat.Style.SHORT);
		
		System.out.println(compUs.format(7_123_456_123_456L));

	}

}
