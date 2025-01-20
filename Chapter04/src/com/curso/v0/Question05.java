package com.curso.v0;

public class Question05 {

	public static void main(String[] args) {
		var sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "ccc"); 
		System.out.println(sb); //abbaccca
		
		StringBuilder sb1 = new StringBuilder("Hello");
		//sb1.append("World").substring(5).insert(1, "bb");
		
		
	}

}
