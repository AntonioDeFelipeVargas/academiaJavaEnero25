package com.curso.v0;

public class Fish {

	public static void main(String[] args) {
				
		int numFish = 4;
		String fishType = "tuna";
		String anotherFish = "" + numFish + 1; //41
		System.out.println(anotherFish);
		
		anotherFish =  numFish + 1 + "";
		System.out.println(anotherFish); //5
		
		//                 5                   tuna
		System.out.println(anotherFish + " " + fishType);

	}

}
