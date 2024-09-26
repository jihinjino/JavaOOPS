package com.Interface;



interface IParent1{
	
	public void  method1();
	
}

interface IParent2{
	
	public void method2();
	
	
}

class child2 implements IParent1,IParent2{
	
	@Override
	public void method1() {
		System.out.println("Hello");
	}

	@Override
	public void method2() {
		System.out.print("Hi");
	}
}

public class MultipleInheritanceInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child2 ch = new child2();
		ch.method1();
		ch.method2();

	}

}
