package com.curso.v0;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
				
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl(null);

		List<Employee> listaEmpleados = employeeService.findAll();
		
		for(Employee emp :listaEmpleados)
			System.out.println(emp);
	}

}
