package com.ak.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity //dodajemy na etapie łaczenia z baza danych Hibernate
@Table(name="Students")
public class Student{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id") //powiazanie pola z klasy z kolumna tabeli = id
	private Long id;
	
	@Column(name="name")
	private String name;

	@Column(name="surname")
	private String surname;

	
	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;
		
	@OneToMany(mappedBy="student") //nazwa pola klasy Student w klasie Book
	private List<Book> book;
	
	@ManyToMany(cascade=CascadeType.ALL) 
    @JoinTable(name="Students_Courses", joinColumns=@JoinColumn(name="student_id"), inverseJoinColumns=@JoinColumn(name="course_id"))
	private List<Course> course;
	
	

	public Address getAddress() {
		return address;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	//musi być pusty konstruktor żeby potem mógł działać dodowanie nowego studenta - funkcja POST!
	public Student(){
		
	}
	
	//ta klasa jest potrzebna tylko do sztywnego dodawnaia -> nie potzrebna hibernatowis
//	public Student(String name, String surname, Long id, String course) {
//		super();
//		this.name = name;
//		this.surname = surname;
//		this.id = id;
//		this.course = course;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}




	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	

//	//	dodajemy hashcode = bo potem korzystamy z  mapy w 
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((course == null) ? 0 : course.hashCode());
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
//		return result;
//	}
//
//	// zeby można było potem porównywać elementy
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (course == null) {
//			if (other.course != null)
//				return false;
//		} else if (!course.equals(other.course))
//			return false;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (surname == null) {
//			if (other.surname != null)
//				return false;
//		} else if (!surname.equals(other.surname))
//			return false;
//		return true;
//	}
	
	
	
	

}
