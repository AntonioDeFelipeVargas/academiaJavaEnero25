package com.curso.v4;

import java.util.*;

public class EmployeeDAOMongoDb implements EmployeeDAO {
	
	@Override
	public List<Employee> findAll() {
		return getListaEmpleados();
	}

	private List<Employee> getListaEmpleados() {
		List<Employee> listaEmpleados = new ArrayList<>();
		
		listaEmpleados.add(new Employee("Tercio","Mongodb","tercio@gmail.com"));
		listaEmpleados.add(new Employee("Epeneto","Mongodb","epeneto@gmail.com"));
		listaEmpleados.add(new Employee("Rolas","Mongodb","rolas@gmail.com"));
		
		return listaEmpleados;
	}

}
