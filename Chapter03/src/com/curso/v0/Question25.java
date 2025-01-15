package com.curso.v0;

public class Question25 {

	public static void main(String[] args) {
		String instrument = "violin";
		final String CELLO = "cello";
		String viola = "viola";
		int p = -1;

		switch (instrument) { //violin
		default:
			p++; //0
			//break;
		case "bass":
			//break;
		case CELLO:
			p++;
		case "VIOLIN":
			p++; //2
		case "viola":
			++p; //3
			break;
		}
		System.out.print(p);
	}
}
