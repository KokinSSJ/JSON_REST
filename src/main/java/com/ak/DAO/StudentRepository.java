package com.ak.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ak.entity.Student;

@Transactional  // nie trzeba pisać rozpoczęcia połączenia, końca połączenia, funkcji transakcji!
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	
	

}
