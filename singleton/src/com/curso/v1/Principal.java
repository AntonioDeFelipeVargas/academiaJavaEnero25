package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V1");
		Conexion con1 = Conexion.getInstance();
		System.out.println(con1);
		Conexion con2 = Conexion.getInstance();
		System.out.println(con2);
		Conexion con3 = Conexion.getInstance();
		System.out.println(con3);
		Conexion con4 = Conexion.getInstance();
		System.out.println(con4);
		Conexion con999 = Conexion.getInstance();
		System.out.println(con999);
//
//		
//		//                (null==null); //true
		System.out.println(con1==con999); //true
	}

}
