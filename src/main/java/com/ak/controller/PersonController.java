package com.ak.controller;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ak.entity.Person;
import com.ak.entity.Student;
import com.ak.service.PersonService;


@RestController
@RequestMapping("/person")

public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Person> getAllPersons(){
		System.out.println("GET");
		return personService.getAllPersons();
	}
	
	//http://127.0.0.1/students?id=1
	//read
	@RequestMapping(method=RequestMethod.GET, value ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Person getPersonById(@PathVariable Long id){
		System.out.println("GET - id " + id);
		return personService.getPersonById(id);
	}
	
	//delete
	@RequestMapping(method=RequestMethod.DELETE, value ="/{id}")
	public void deletePersonById(@PathVariable Long id){
		System.out.println("DELETE - id " + id);
		personService.deletPersonById(id);
	}
	
	//add, create
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addPerson(@RequestBody Person person){
		System.out.println("POST");
		personService.addPerson(person);
	}
	
	//update
	@RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updatePerson(@RequestBody Person person) {
		System.out.println("PUT");
		personService.updatePerson(person);
		
	}
	

}
