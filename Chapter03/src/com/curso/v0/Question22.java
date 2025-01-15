package com.curso.v0;

public class Question22 {
	public static void main(String[] args) {
		int tailFeathers = 3;
		final int one = 1;

		switch (tailFeathers) {
		case one: //1
			System.out.print(3 + " ");
			break;
		default:
		case 3:
			System.out.print(5 + " ");
		}

		while (tailFeathers > 1) {
			System.out.print(--tailFeathers + " ");
		}
	}
}
