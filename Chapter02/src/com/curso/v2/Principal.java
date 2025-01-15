package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		byte b1= 1;
		byte b2= 2;
		int b3 = b1 + b2;
		//System.out.println(b3); 
		
		short sh1 = 1;
		short sh2 = 2;
		//sh1 = (short)(sh1 + sh2);
		sh1 += sh2;
		System.out.println(sh1);
		
		char ch1 = 1;
		char ch2 = 2;
		ch1 += ch2;
		System.out.println(ch1);
		
		char ch3 = 65;
		System.out.println(ch3); 
		
		int i1 = 127;
		int i2 = 127;
		
		int i3 = 128;
		int i4 = 128;
		
		Integer integer1 = i1; //Autoboxing
		Integer integer2 = i2;
		
		System.out.println(integer1==integer2); //true
		
		Integer integer3 = i3; //Autoboxing
		Integer integer4 = i4;
		
		System.out.println(integer3==integer4); //false
		
		//-128 al 127 //Cache Integer

		
	}

}
