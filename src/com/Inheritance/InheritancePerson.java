package com.Inheritance;

class PersonDetails{
	String name;
	String address;
	
	public PersonDetails(String name, String address) {
		this.name=name;
		this.address =address;
	}
}
class Student extends PersonDetails{
	String grade;
	int id;
	
	public Student(String name,String address,String grade,int id) {
		super(name,address);
		this.grade = grade;
		this.id = id;
	}
	
	public void Add() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(grade);
		System.out.println(id);
	}
}

public class InheritancePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("JIHIN","MARTHANDAM","A+",12);
		s.Add();
	}

}
