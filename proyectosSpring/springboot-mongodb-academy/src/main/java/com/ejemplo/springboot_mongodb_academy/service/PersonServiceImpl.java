package com.ejemplo.springboot_mongodb_academy.service;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.SortOperation;
import org.springframework.data.mongodb.core.aggregation.UnwindOperation;
import org.springframework.stereotype.Service;

import com.ejemplo.springboot_mongodb_academy.collection.Person;
import com.ejemplo.springboot_mongodb_academy.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
    private PersonRepository personRepository;
	@Autowired
	private MongoTemplate mongoTemplate;

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
	
	@Override
    public List<Document> getOldestPersonByCity() {
        UnwindOperation unwindOperation
                = Aggregation.unwind("addresses");
        SortOperation sortOperation
                = Aggregation.sort(Sort.Direction.DESC,"age");
        GroupOperation groupOperation
                = Aggregation.group("addresses.city")
                .first(Aggregation.ROOT)
                .as("oldestPerson");

        Aggregation aggregation
                = Aggregation.newAggregation(unwindOperation,sortOperation,groupOperation);

        List<Document> person
                = mongoTemplate.aggregate(aggregation, Person.class,Document.class).getMappedResults();
        return person;
    }

}
