package com.curso.v0;

public class Question47 {

	public static void main(String[] args) {
		int x=6; // 110
		int y=3; // 011
		//     &    010    
		//     |    110
		//          110 = 6
		
		int z = x & y | x;
		System.out.println(z);


	}

}
