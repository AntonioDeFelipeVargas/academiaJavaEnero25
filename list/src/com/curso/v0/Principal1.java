package com.curso.v0;

import java.util.ArrayList;
import java.util.List;

public class Principal1 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>(10);
		list1.add("a");
		list1.add("b");
		list1.add("a");
		list1.add("b");
		list1.add("a");
		list1.add("b");
		list1.add("a");
		list1.add("b");
		list1.add("a");
		list1.add("b");
		list1.add("a");
		list1.add("b");
		list1.add("a");
		list1.add("b");
		list1.add("a");
		System.out.println(list1);
		
		ArrayList<Object> list = new ArrayList<>(); 
		list.add("a");
		
		for (Object s:list){
			System.out.println(s);
		}
		
		
	}

}
