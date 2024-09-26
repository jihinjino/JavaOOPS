package com.Inheritance;

//SINGLE INHERITANCE

class A{
	int a =10;
	
	public A(int A) {
		int a = A;
		System.out.println("Hii");
	}
	public void MyMethod() {
		System.out.println("MyMethod");
	}
}

class B extends A{
	
	public B(int A) {
		super(A);
		System.out.println("Hello");
	}

	int b=10;
	
	public void MyMethod1(){
		System.out.println("MyMethod1");
	}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B(12);
//		System.out.println(b.a);
//		System.out.println(b.b);
		b.MyMethod();
		b.MyMethod1();
		
	}

}
