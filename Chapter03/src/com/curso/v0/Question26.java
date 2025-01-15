package com.curso.v0;

public class Question26 {
    public static void main(String[] args) {
        int w = 0, r = 1;
        String name = "";
        while (w < 2) {
            name += "A";
            do {
            	//int i = 10;
                name += "B";
                if (name.length() > 0) 
                    name += "C";
                else 
                    break;
            } while (r <= 1);
            //System.out.println(i); //No Compila
            r++;
            w++;
        }
        //w     r     name
        //0     1     ""
        //            "A"
        //            "AB"
        //            "ABC"
        System.out.println(name);
    }
}

