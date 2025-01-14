package com.curso.v0;

public class Question18 {
    public static void main(String[] args) {
        String s1 = "purr";
        String s2 = "";

        s1.toUpperCase(); //PURR
        s1.trim(); //purr
        s1.substring(1, 3); //ur
        s1 += "two"; //s1 = s1 + "two";
        System.out.println(s1); //purrtwo

        s2 += 2; //2
        s2 += 'c'; //2c
        s2 += false; //2cfalse //NO PoolString

        if (s2 == "2cfalse") {
            System.out.println("==");
        }
        if (s2.equals("2cfalse")) {
            System.out.println("equals");
        }
        System.out.println(s1.length());
    }
}
