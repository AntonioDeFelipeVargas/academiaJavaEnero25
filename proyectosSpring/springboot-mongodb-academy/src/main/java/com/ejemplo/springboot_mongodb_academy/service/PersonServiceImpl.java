package com.ejemplo.springboot_mongodb_academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.springboot_mongodb_academy.collection.Person;
import com.ejemplo.springboot_mongodb_academy.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
    private PersonRepository personRepository;

	@Override
	public String save(Person person) {
		personRepository.save(person);
        return person.getPersonId();
	}
	
	@Override
	public List<Person> findAll() {
        return personRepository.findAll();
	}
	
	@Override
	public void delete(String id) {
        personRepository.deleteById(id);
	}

}
