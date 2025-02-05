package com.curso.v0;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;


public class PrincipalFunction {

	public static void main(String[] args) {

		Function<String,Integer> fun1 = s -> s.length();
		
		int i = fun1.apply("Hello Java");
		
		System.out.println(i);
		
		User user1 = new User("Patrobas","patrobas@gmail.com",2);
		
		Function<User,String> fun2 = u -> u.mail;
		
		System.out.println(fun2.apply(user1));
		
		Function<String,String> fun3 = s -> s.concat("$$$");
		
		System.out.println(fun3.apply("Java"));
		
		UnaryOperator<String> uo1 = s -> s.concat("$$$");
		
		System.out.println(uo1.apply("Python"));
		
		BinaryOperator<Double> bo = (x,y) -> x*y;
		
		System.out.println(bo.apply(8.0,4.0));
		
	}

}
