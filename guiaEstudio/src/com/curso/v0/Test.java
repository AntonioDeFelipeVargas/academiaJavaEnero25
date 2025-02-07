package com.curso.v0;

class A  {
    public A() {
    	super();
        System.out.println("A's constructor");
    }
}

class B extends A {
    public B() {
        this(10);
        System.out.println("B's constructor");
    }
    public B(int i) {
        System.out.println("B's constructor int");
    }
}

class C extends B {
    public C() {
    	super();
        System.out.println("C's constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        C c = new C();
    }
}