package com.curso.v1;

public class Box {
	
	double peso = 0.5;
	Box box1; //HAS-A
	
	
	public static void main(String[] args) {
		Box caja1 = new Box();
		Box caja2 = new Box();
		caja1.asignar(caja2);
		
		System.out.println(caja2 == caja1.box1); //true
		System.out.println(caja2.peso); //9.0
	}
	
	void asignar(Box caja) {
		this.box1 = caja; //<== 3 Variables Referencia
		caja.peso = 9.0;
	}

}
