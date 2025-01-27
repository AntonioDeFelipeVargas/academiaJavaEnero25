package com.trywithresource.v2;

public class ConexionMongoDb implements AutoCloseable {
	
	ConexionMongoDb(){
		System.out.println("Constructor ConexionMongoDb");
	}
	
	void open() throws Exception{
		System.out.println("Open Conexion");
	}
	
	@Override
	public void close() throws Exception{
		System.out.println("Close Conexion");
	}

}
