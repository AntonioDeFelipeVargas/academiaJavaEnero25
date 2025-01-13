package com.curso.v0;

public class Box {
	
	Box box1; //HAS-A
	
	public static void main(String[] args) {
		Box caja1 = new Box();
		caja1.asignar1();
		
		System.out.println(caja1 == caja1.box1); //true
	}
	
	void asignar1() {
		this.box1 = this;
	}
	
	

}
