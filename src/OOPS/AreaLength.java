package OOPS;

import java.util.Scanner;

class Area{
	
	public double length;
	public double breadth;
	public void setDim(double l, double b) {
		length =l;
		breadth =b;
	}
	public void getArea() {
		System.out.println("The area of the rec is: "+length*breadth);
	}
}
public class AreaLength {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		Area rec = new Area();	
		System.out.print("Enter the Length: ");
		double length = sc.nextDouble();
		System.out.print("Enter the Breadth: ");
		double breadth = sc.nextDouble();
		rec.setDim(length, breadth);
		rec.getArea();
	}

}
