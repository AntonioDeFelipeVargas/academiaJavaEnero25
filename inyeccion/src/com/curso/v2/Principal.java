package com.curso.v2;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
				
		EmployeeServiceImpl employeeService = Inyector.asignarEmployeeDAO();

		List<Employee> listaEmpleados = employeeService.findAll();
		
		for(Employee emp :listaEmpleados)
			System.out.println(emp);
	}

}
