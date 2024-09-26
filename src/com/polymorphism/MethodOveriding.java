//Method overriding can be achieved through inheritance.


package com.polymorphism;


class MyClass{
	void m1() {
		System.out.println("Parent Method");
	}
}

class child extends MyClass{
	@Override
	void m1() {
		System.out.println("Child Method");
		super.m1();
		//super keyword - is to access parent keyword immediately.
	}
}

public class MethodOveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child m = new child();
		m.m1();
	}

}
