package org.benjamin.model;

import java.util.ArrayList;
import java.util.List;

public class Class {
	private int id;
	private String name;
	private List<Student> students;
	
	public Class(String name) {
		super();
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student student){
		student.setId(students.size()+1);
		students.add(student);
	}
	
	public List<Student> getStudentsOlderThan(int age){
		List<Student> olderThanAgeStudents = new ArrayList<Student>();
		
		return olderThanAgeStudents;
	}
}
