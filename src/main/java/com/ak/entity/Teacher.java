package com.ak.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Teachers")
@DiscriminatorColumn(discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("teacher")
public class Teacher extends Person {
	
	@Column(name="degree")
	private String degree;
	
	@Column(name="salary")
	private int salary;

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getSalary() {
		return salary;
	}

	public Teacher() {
		super();
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
