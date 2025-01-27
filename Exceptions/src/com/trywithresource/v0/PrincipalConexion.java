package com.trywithresource.v0;

public class PrincipalConexion {

	public static void main(String[] args){

		ConexionMongoDb conn1 = new ConexionMongoDb();
		try {
			conn1.open();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		ConexionMongoDb conn2 = new ConexionMongoDb();
		try {
			conn2.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
