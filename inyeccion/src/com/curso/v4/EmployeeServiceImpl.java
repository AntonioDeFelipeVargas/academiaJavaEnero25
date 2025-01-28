package com.curso.v4;

import java.util.List;

public class EmployeeServiceImpl {

	private EmployeeDAO employeeDAO; 

	public EmployeeServiceImpl() {
    }
	
	public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
	
	//@Autowired
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
}
