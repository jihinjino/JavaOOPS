package com.abstaction;

abstract class Demo{
	public void m1() {
		System.out.println("Non abstract method");
	}
	
	public abstract void method(); //Abstract method
}
class child1 extends Demo{
	
	public void method() {
		System.out.println("Abstract Method");
	}
}
public class AbstractionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child1 c = new child1();
		c.method();
		c.m1();
	}

}
