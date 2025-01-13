package com.curso.v0;

public class Bear {
    private Bear pandaBear;

    private void roar(Bear b) {
    	//System.out.println(b);
        System.out.println("Roar!");
        pandaBear = b;
    }

    public static void main(String[] args) {
        Bear brownBear = new Bear();
        Bear polarBear = new Bear();
        //System.out.println(polarBear);
        brownBear.roar(polarBear);
        
        System.out.println(polarBear == brownBear.pandaBear);
        
        polarBear = null;
        brownBear = null; //GC
        System.gc();
    }
}
