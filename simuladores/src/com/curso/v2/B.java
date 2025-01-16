package com.curso.v2;

class A {
	A() {
		print();
	}

	void print() {
		System.out.print("A ");
	}
}

class B extends A {
	
	final int i=4;

	public static void main(String[] args) {
		A a = new B();
		
		a.print(); //4
	}

	@Override
	void print() {
		System.out.print(i +" "); //0
	}
}
