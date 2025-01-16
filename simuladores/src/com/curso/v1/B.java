package com.curso.v1;

class A {
	A() {
		print();
	}

	void print() {
		System.out.print("A ");
	}
}

class B extends A {

	public static void main(String[] args) {
		A a = new B();
	}

	void print() {
		System.out.print("B ");
	}
}
