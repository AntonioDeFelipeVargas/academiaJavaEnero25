package com.curso.v4;

import java.util.*;

public class EmployeeDAOJpaImpl implements EmployeeDAO {
	
	@Override
	public List<Employee> findAll() {
		return getListaEmpleados();
	}

	private List<Employee> getListaEmpleados() {
		List<Employee> listaEmpleados = new ArrayList<>();
		
		listaEmpleados.add(new Employee("Patrobas","JPA","patrobas@gmail.com"));
		listaEmpleados.add(new Employee("Andronico","JPA","andronico@gmail.com"));
		listaEmpleados.add(new Employee("Filologo","JPA","filologo@gmail.com"));
		
		return listaEmpleados;
	}

}
