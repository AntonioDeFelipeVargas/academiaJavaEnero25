package com.curso.v0;

class Book {
    protected final int pages = 100;
    final void mA() {
        System.out.println("In B.mA " + pages);
    }
}

class Encyclopedia extends Book {
    private int pages = 200;  // 1
    void mB() {
        System.out.println("In E.mB " + pages);
    }
//    void mA() {  // 2
//        System.out.println("In E.mA " + pages);
//    }
}

public class TestClass {
	
	public static void main(String[] args) {
        Book o1 = new Encyclopedia();  // 3
        Book o2 = new Book();
        
        o1.mA();
        //o1.mB(); // 5
        ((Encyclopedia)o1).mB();  
	}

}
