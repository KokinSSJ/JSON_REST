package com.ak.service;

import java.util.Collection;

import com.ak.entity.Person;
import com.ak.entity.Student;

public interface PersonService {
	
	//takie samo jak w StudentDao!!
	Collection <Person> getAllPersons();
	Person getPersonById(Long id);
	void deletPersonById(Long id);
	void addPerson(Person person);
	void updatePerson(Person person);
	

}
