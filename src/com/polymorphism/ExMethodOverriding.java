package com.polymorphism;

class A{
	void m1() {
		System.out.println("Hello");
	}
}

class B extends A{
	@Override
	void m1() {
		System.out.println("Hii!");
		super.m1();
	}
}

public class ExMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.m1();
	}

}
