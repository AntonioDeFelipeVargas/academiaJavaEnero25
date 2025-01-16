package com.curso.v0;

class A extends Object {
	A() {
		super(); //DEBE SER LA PRIMERA LINEA
		System.out.println("Constructor A");
	}
}

class B extends A {

	public B() {
		super();
		System.out.println("Constructor B");
	}

	public static void main(String[] args) {
		A a = new B();
	}

}
