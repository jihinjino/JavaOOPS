package com.Inheritance;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}

class Emplyoee extends Person{
	
	int emplyoeeId;

	public Emplyoee(String name, int age, int emplyoeeId) {
		
		super(name, age);
		this.emplyoeeId = emplyoeeId;
		// TODO Auto-generated constructor stub
	} 
	public void empl() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(emplyoeeId);
	}
}

public class EmplyoeeInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Emplyoee emp = new Emplyoee("Jihin",22,112);
		emp.empl();
	}

}
