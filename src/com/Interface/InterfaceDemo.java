package com.Interface;



interface IDemo{
	
	public void m1();
	
}

interface IDemo1{
	
	public void m1(int a,int b);
	
}

class Ichild implements IDemo,IDemo1{

	@Override
	public void m1() {
		System.out.println("Hello This is m1 Method");
	}
	@Override
	public void m1(int a,int b) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
}



public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ichild i = new Ichild();
		i.m1();
		i.m1(1,2);
	}

}
