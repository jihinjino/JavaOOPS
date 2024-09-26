//Method Overloading. compile time 

package com.polymorphism;

public class PolyMorphism {
	
	public void m1() {
		System.out.println("No-Arguments");
	}
	
	public void m1(int a , int b) {
		System.out.println("Int arguments");
	}
	public void m1(float a,float b) {
		System.out.println("Float Arguments");
	}
	
	public void m1(int a,int b,int c){
		System.out.println("Three parameters");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyMorphism pm = new PolyMorphism();
		pm.m1();
		pm.m1(1,1);
		pm.m1(1.1f,1.1f);
		pm.m1(1,2,3);

	}

}
