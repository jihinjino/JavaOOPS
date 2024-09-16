package OOPS;

class Triangle{
	public int side1 =5;
	public int side2 =10;
	public int side3 =7;
	
	public void getArea() {
		
		double s = (side1+side2+side3)/2;
		
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.println("The area of the Triangle is: "+area);
		
	}
	public void getPerimeter() {
		System.out.println("The perimeter of the Triangle is: "+(side1+side2+side3));
	}
	
}


public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		t.getPerimeter();
		t.getArea();
	}

}
