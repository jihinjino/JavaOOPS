package com.Encapsulation;



class Student11{
	private String name;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student11 s = new Student11();
		s.setName("Jihin");
		s.setRollno(12);
		
		System.out.println(s.getName());
		System.out.println(s.getRollno());

	}

}
