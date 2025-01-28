package com.curso.v1;

//Inyector de Spring Core
public class Inyector {
	
	static EmployeeDAO employeeDAO = new EmployeeDAOJpaImpl();

	public static EmployeeServiceImpl asignarEmployeeDAO() {
		return new EmployeeServiceImpl(employeeDAO);
	}

}
