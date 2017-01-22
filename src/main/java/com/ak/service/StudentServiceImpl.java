package com.ak.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ak.DAO.StudentRepository;
import com.ak.entity.Student;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	//  w tej klasie w funkcjach mozna dodawac jakies specjalne funkcje, np. zapisanie do pliku o pobraniu, usuwanie, obr�bka danych z DAO
	
	
	
	@Override
	public Collection<Student> getAllStudents() {
		//tutaj mozna dac dodatkowa logike biznesowa ->
		return studentRepository.findAll();
	}


	@Override
	public Student getStudentById(Long id) {
		//tutaj mozna dac dodatkowa logike biznesowa ->
		return studentRepository.getOne(id);
	}

	@Override
	public void deletStudentById(Long id) {
		studentRepository.delete(id);
		
	}

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student); //do updatu i do dodania 'save' ponieważ sprawdza ze jezeli nie ma to dodaj, jezeli jest to update
		
	}
	
	

}
