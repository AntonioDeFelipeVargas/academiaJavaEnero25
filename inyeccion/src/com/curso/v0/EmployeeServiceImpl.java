package com.curso.v0;

import java.util.List;

public class EmployeeServiceImpl {

	//HAS-A (ABSTRACTO)
	private EmployeeDAO employeeDAO; 
	
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
		//ALTO ACOMPLAMIENTO
		theEmployeeDAO = new EmployeeDAOJpaImpl();
		
        employeeDAO = theEmployeeDAO;
    }
	
	public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
