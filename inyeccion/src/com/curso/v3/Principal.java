package com.curso.v3;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3");
				
		EmployeeServiceImpl employeeService = Inyector.asignarEmployeeDAO();

		List<Employee> listaEmpleados = employeeService.findAll();
		
		for(Employee emp :listaEmpleados)
			System.out.println(emp);
	}

}
