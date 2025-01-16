package com.curso.v0;

public class ParamTest1 {
	public static void printSum(int a, int b) { //1
		System.out.println("In int " + (a + b));
	}
	
//	public static void printSum(int... enteros) { //ULTIMA OPCION
//		System.out.println("In varargs " + enteros[0] + enteros[1]);
//	}
	
//	public static void printSum(Object a, Object b) { //5
//		System.out.println("In Object " + a + b);
//	}

//	public static void printSum(Integer a, Integer b) { //4
//		System.out.println("In Integer " + (a + b));
//	}

//	public static void printSum(double a, double b) { //3
//		System.out.println("In double " + (a + b));
//	}
	
//	public static void printSum(long a, long b) { //2
//		System.out.println("In long " + (a + b));
//	}
	
	public static void printSum(Long a, Long b) {
		System.out.println("In Long " + (a + b));
	}

	public static void main(String[] args) {
		printSum(1, 2);
	}
} 