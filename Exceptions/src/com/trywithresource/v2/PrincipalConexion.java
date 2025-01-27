package com.trywithresource.v2;

public class PrincipalConexion {

	public static void main(String[] args){

		try (ConexionMongoDb conn1 = new ConexionMongoDb()) {
			conn1.open();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
