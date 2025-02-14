package com.curso.v0;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Principal1 {
	
	public static void main(String[] args) throws ParseException {
		
		Locale locale = Locale.getDefault(); 
		System.out.println(locale); // Muestra algo como en_MX

		int asistentesPorAño = 3_200_000;
		int asistentesPorMes = asistentesPorAño / 12;

		NumberFormat usFormat = NumberFormat.getInstance(Locale.US);
		System.out.println(usFormat.format(asistentesPorMes)); // 266,666

		NumberFormat deFormat = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(deFormat.format(asistentesPorMes)); // 266.666
		
		NumberFormat frFormat = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(frFormat.format(asistentesPorMes)); // 266 666

		double precio = 48;
		NumberFormat moneda = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(moneda.format(precio)); // $48.00
		
		NumberFormat monedaGr = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println(monedaGr.format(precio)); 
		
		NumberFormat monedaFr = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(monedaFr.format(precio)); 
		
		double tazaExito = 0.802;
		NumberFormat porcent = NumberFormat.getPercentInstance(Locale.US);
		System.out.println(porcent.format(tazaExito)); // 80%
		
		NumberFormat porcentGr = NumberFormat.getPercentInstance(Locale.GERMANY);
		System.out.println(porcentGr.format(tazaExito)); 
		
		NumberFormat porcentFr = NumberFormat.getPercentInstance(Locale.JAPAN);
		System.out.println(porcentFr.format(tazaExito)); 

		String valor = "40.45";
		NumberFormat enFormat = NumberFormat.getInstance(Locale.US);
		System.out.println(enFormat.parse(valor)); // 40.45

		NumberFormat fraFormat = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(fraFormat.parse(valor)); // 40 (trunca tras el punto porque para Francia “.” no indica decimal)


	}

}
