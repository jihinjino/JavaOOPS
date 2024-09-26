package com.Inheritance;

class Shape{
	
	int length;
	int breadth;
	
	public Shape(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double Area() {
		return 0;
	}
}

class Circle extends Shape{

	public Circle(int radius) {
		super(radius,radius);
	}
	@Override
	public double Area() {
		return Math.PI*Math.pow(length,2);	
	}
	
}

class Rectangle extends Shape{

	public Rectangle(int length, int breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}
	public double Area() {
		return length*breadth;
	}
	
}


public class ShapeInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5);
		System.out.println("The area of the circle: "+c.Area());
		Rectangle r = new Rectangle(1,2);
		System.out.println("The area of the rectangle: "+r.Area());
			
	}

}
