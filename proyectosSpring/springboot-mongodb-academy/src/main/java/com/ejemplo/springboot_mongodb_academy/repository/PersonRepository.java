package com.ejemplo.springboot_mongodb_academy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ejemplo.springboot_mongodb_academy.collection.Person;

public interface PersonRepository extends MongoRepository<Person, String>{

}
