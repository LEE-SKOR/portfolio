package com.exam01;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private String department;
	private String studentID;
	private double average;
	
	
	public Student(String name, String department, String studentID, double average) {
		this.name = name;
		this.studentID = studentID;
		this.department = department;
		this.average = average;
	}
	public String getName() {
		return name;
	}
	public String getStudentID() {
		return studentID;
	}
	public String getDepartment() {
		return department;
	}
	public double getAverage() {
		return average;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	
	
	
}
