package com.curso.v2;

import java.util.List;

public class EmployeeServiceImpl {

	//HAS-A (ABSTRACTO)
	private EmployeeDAO employeeDAO; 
	
	//@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }
	
	public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
