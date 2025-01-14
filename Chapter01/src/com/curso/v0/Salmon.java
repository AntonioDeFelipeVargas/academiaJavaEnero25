package com.curso.v0;

public class Salmon {
    int count; //4
    {
        System.out.print(count + "-");
    }
    {
        count++;
    }

    public Salmon() {
        count = 4;
        System.out.print(2 + "-");
    }

    public static void main(String[] args) {
        System.out.print(7 + "-"); //7-0-2-4-
        Salmon s = new Salmon();
        System.out.print(s.count + "-");
    }
}
