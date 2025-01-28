package com.curso.v2;

import java.util.*;

public class EmployeeDAOMongoDb implements EmployeeDAO {
	
	@Override
	public List<Employee> findAll() {
		return getListaEmpleados();
	}

	private List<Employee> getListaEmpleados() {
		List<Employee> listaEmpleados = new ArrayList<>();
		
		listaEmpleados.add(new Employee("Tercio","Perez","tercio@gmail.com"));
		listaEmpleados.add(new Employee("Epeneto","Perez","epeneto@gmail.com"));
		listaEmpleados.add(new Employee("Rolas","Perez","rolas@gmail.com"));
		
		return listaEmpleados;
	}

}
