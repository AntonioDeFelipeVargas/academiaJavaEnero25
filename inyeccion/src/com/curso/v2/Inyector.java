package com.curso.v2;

//Inyector de Spring Core
public class Inyector {
	
	static EmployeeDAO empDao1 = new EmployeeDAOJpaImpl();
	static EmployeeDAO empDao2 = new EmployeeDAOMongoDb();
	static EmployeeDAO empDao3 = new EmployeeDAOWebService();

	public static EmployeeServiceImpl asignarEmployeeDAO() {
		return new EmployeeServiceImpl(empDao3);
	}

}
