package com.polymorphism;

public class ExampleMethodOverloading {
	
	public void Area() {
		System.out.println("Area");
		
	}
	public void Area(int a,int b) {
		System.out.println("Area of two variable");
	}
	public void Area(int a,float b) {
		System.out.println("int,float");
	}
	public void Area(float a,float b) {
		System.out.println("Area of the float variable");
	}
	
	public Object Area(int a,int b,int c) {
		return "hello";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ExampleMethodOverloading mm = new ExampleMethodOverloading();
	
	mm.Area();
	mm.Area(1,1);
	mm.Area(1,2f);
	System.out.println(mm.Area(1,2,3));
	mm.Area(1f,2f);
	}

}
