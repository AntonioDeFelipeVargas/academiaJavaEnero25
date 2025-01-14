package com.curso.v0;

//Métodos static ó Bloques Static
//NO TIENEN ACCESO a las variables de Instancia

//Métodos instancia de clase ó Bloques instancia de clase
//SI TIENEN ACCESO a las variables static

public class Salmon2 {
    int count; 
    static int contador;
    {
        System.out.print(count + "-");
        System.out.println(contador);
    }
    
    static {
    	System.out.println(contador);
    }
    
    {
        count++;
    }

    public Salmon2() {
        count = 4;
        System.out.print(2 + "-");
    }

    public static void main(String[] args) {
        System.out.print(7 + "-"); 
        Salmon2 s = new Salmon2();
        System.out.print(s.count + "-");
    }
}
