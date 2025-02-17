package p2;

import p1.*;
public class B extends p1.A {
	
    public void process(B a) {
        a.i = a.i * 2;
    }

    public static void main(String[] args) {
        B a = new B();
        B b = new B();
        b.process(a);
        System.out.println(a.getI());
    }
    
}