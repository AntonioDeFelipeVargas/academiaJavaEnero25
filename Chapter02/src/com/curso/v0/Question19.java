package com.curso.v0;

public class Question19 {

	public static void main(String[] args) {
		
		int start = 7;
		int end = 4;
		
		//     8
		//  4+8
		end += ++start;
		
		System.out.println(start);
		System.out.println(end);
		
		System.out.println(Integer.MAX_VALUE);
		long l = (int)(Integer.MAX_VALUE)+1;
		System.out.println(l);
		
		
		
		
	}

}
