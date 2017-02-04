package com.ak.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ak.entity.Person;
import com.ak.entity.Student;

@Transactional  // nie trzeba pisać rozpoczęcia połączenia, końca połączenia, funkcji transakcji!
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	
	

}
