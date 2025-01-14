package com.curso.v0;

public class PoliceBox2 {
    String color; //null
    long age; //0

    public PoliceBox2() { //SI ES UN CONSTRUCTOR
        color = "blue";
        age = 1200;
    }

    public static void main(String[] time) {
    	PoliceBox2 p = new PoliceBox2();
    	PoliceBox2 q = new PoliceBox2();
        p.color = "green";
        p.age = 1400;
        p = q;
        System.out.println("Q1=" + q.color); //blue
        System.out.println("Q2=" + q.age); //1200
        System.out.println("P1=" + p.color); //blue
        System.out.println("P2=" + p.age); //1200
    }
}

