package com.ejemplo.springboot_mongodb_academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
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


}
