package com.ak.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.DAO.PersonRepository;
import com.ak.entity.Person;
import com.ak.entity.Student;


@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	//  w tej klasie w funkcjach mozna dodawac jakies specjalne funkcje, np. zapisanie do pliku o pobraniu, usuwanie, obr�bka danych z DAO
	
	
	
	@Override
	public Collection<Person> getAllPersons() {
		//tutaj mozna dac dodatkowa logike biznesowa ->
		return personRepository.findAll();
	}


	@Override
	public Person getPersonById(Long id) {
		//tutaj mozna dac dodatkowa logike biznesowa ->
		return personRepository.findOne(id);
	}

	@Override
	public void deletPersonById(Long id) {
		personRepository.delete(id);
		
	}

	@Override
	public void addPerson(Person person) {
		personRepository.save(person);
		
	}

	@Override
	public void updatePerson(Person person) {
		personRepository.save(person); //do updatu i do dodania 'save' ponieważ sprawdza ze jezeli nie ma to dodaj, jezeli jest to update
		
	}
	
	

}
