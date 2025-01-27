package com.trywithresource.v1;

public class PrincipalConexion {

	public static void main(String[] args){

		ConexionMongoDb conn1 = new ConexionMongoDb();
		try {
			conn1.open();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn1.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
