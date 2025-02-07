package com.curso.v0;

public class ScopeTest {

	private int value = 10; 

	public void modifyValue() {
		int value = 20;
		this.value = 30; 
		System.out.println(value +" "+this.value); //30
	}

	public static void main(String[] args) {
		ScopeTest test = new ScopeTest();
		test.modifyValue();
	}

}
