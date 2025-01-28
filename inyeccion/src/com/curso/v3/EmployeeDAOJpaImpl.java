package com.curso.v3;

import java.util.*;

public class EmployeeDAOJpaImpl implements EmployeeDAO {
	
	@Override
	public List<Employee> findAll() {
		return getListaEmpleados();
	}

	private List<Employee> getListaEmpleados() {
		List<Employee> listaEmpleados = new ArrayList<>();
		
		listaEmpleados.add(new Employee("Patrobas","Gomez","patrobas@gmail.com"));
		listaEmpleados.add(new Employee("Andronico","Gomez","andronico@gmail.com"));
		listaEmpleados.add(new Employee("Filologo","Gomez","filologo@gmail.com"));
		
		return listaEmpleados;
	}

}
