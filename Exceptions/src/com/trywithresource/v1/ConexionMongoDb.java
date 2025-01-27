package com.trywithresource.v1;

public class ConexionMongoDb {
	
	ConexionMongoDb(){
		System.out.println("Constructor ConexionMongoDb");
	}
	
	void open() throws Exception{
		System.out.println("Open Conexion");
	}
	
	void close() throws Exception{
		System.out.println("Close Conexion");
	}

}
