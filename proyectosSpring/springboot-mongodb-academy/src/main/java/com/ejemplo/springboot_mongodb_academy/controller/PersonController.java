package com.ejemplo.springboot_mongodb_academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.springboot_mongodb_academy.collection.Person;
import com.ejemplo.springboot_mongodb_academy.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
    private PersonService personService;
	
	@PostMapping
	public String save(@RequestBody Person person) {
        return personService.save(person);
    }
	
	@GetMapping
	public List<Person> getPersons() {
        return personService.findAll();
    }
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
        personService.delete(id);
    }


}
