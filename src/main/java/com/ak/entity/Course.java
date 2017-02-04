package com.ak.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "hour_time")
	private String hourTime;

////	 tego nie ma w ManyToMany!
//	 @ManyToMany(cascade=CascadeType.ALL)
////	 @JsonIgnore
//	 @JoinTable(name="Students_Courses", joinColumns=@JoinColumn(name="course_id"), inverseJoinColumns=@JoinColumn(name="student_id"))
//	 private Set<Student> student ;//= new HashSet<>();
//	
//	 public Set<Student> getStudent() {
//	 return student;
//	 }
//	
//	
//	
//	 public void setStudent(Set<Student> student) {
//	 this.student = student;
//	 }

	public Course() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHourTime() {
		return hourTime;
	}

	public void setHourTime(String hourTime) {
		this.hourTime = hourTime;
	}

}
