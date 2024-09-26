package com.polymorphism;


class Parent{
	
	public void property() {
		System.out.println("Parent property");
	}
	public void mar() {
		System.out.println("Arrange");
	}
}

class child1 extends Parent{
	
	public void mar() {
		System.out.println("Love");
	}
	
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c = new child1();
		c.mar();
		
		Parent po = new child1();
		po.mar();
	}

}
