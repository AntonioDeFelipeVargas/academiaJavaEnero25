package com.curso.v0;

public class Question17 {

	public static void main(String[] args) {

		int ticketsTaken = 1; 
		int ticketsSold = 3;

		//                 1
		//             2
		//3+2=5
		ticketsSold += 1 + ticketsTaken++;
		System.out.println(ticketsSold);
		//ticketsTaken = 2
		System.out.println(ticketsTaken);
		ticketsTaken *= 2;
		System.out.println(ticketsTaken); //4

		ticketsSold += (long)1; 
		System.out.println(ticketsSold); //6
	}

}
