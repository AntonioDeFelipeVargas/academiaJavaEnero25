package com.curso.v3;

import java.util.*;

public class EmployeeDAOWebService implements EmployeeDAO {
	
	@Override
	public List<Employee> findAll() {
		return getListaEmpleados();
	}

	private List<Employee> getListaEmpleados() {
		List<Employee> listaEmpleados = new ArrayList<>();
		
		listaEmpleados.add(new Employee("WebSevice1","Perez","tercio@gmail.com"));
		listaEmpleados.add(new Employee("WebSevice2","Perez","epeneto@gmail.com"));
		listaEmpleados.add(new Employee("WebSevice3","Perez","rolas@gmail.com"));
		
		return listaEmpleados;
	}

}
