package org.benjamin.model;

import org.benjamin.model.Student;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import junit.framework.Assert;

public class StudentSteps {
	
	Student student;
	
	@When("Add a student with name $name, sex $sex and age $age")
	public void addStudentWithNameSexAge(String name, boolean sex, int age){
		student = new Student(name, sex, age);
	}
	
	@Then("check student's name $name")
	public void checkStudentName(String name){
		Assert.assertEquals(name, student.getName());
	}
	
	@Then("check student's sex $sex")
	public void checkStudentSex(boolean sex){
		Assert.assertEquals(sex, student.isSex());
	}
	
	@Then("check student's age $age")
	public void checkStudentAge(int age){
		Assert.assertEquals(age, student.getAge());
	}
	
	@Then("check student's address $address")
	public void checkStudentAddress(String address){
		Assert.assertEquals(address, student.getAddress());
	}
}
