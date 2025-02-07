package com.curso.v0;

public class StaticNonStaticBlockTest {
	static {
		System.out.println("Static block 1");
	}

	{
		System.out.println("Instance block 1");
	}

	public StaticNonStaticBlockTest() {
		System.out.println("Constructor");
	}

	public static void staticMethod() {
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		StaticNonStaticBlockTest.staticMethod();
		new StaticNonStaticBlockTest();
		
//		new StaticNonStaticBlockTest();
//		new StaticNonStaticBlockTest();
		System.out.println("EndProgram");
	}
	
	{
		System.out.println("Instance block 2");
	}
	
	static {
		System.out.println("Static block 2");
	}
}
