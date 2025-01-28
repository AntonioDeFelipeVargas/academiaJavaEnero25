package com.curso.v3;

import java.util.List;

public class EmployeeServiceImpl {

	//@Autowired
	public EmployeeDAO employeeDAO; 
	
	public EmployeeServiceImpl() {
    }
	
	public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
