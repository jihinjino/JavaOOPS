package OOPS;

class Triangle1{

	public void getArea(double side1,double side2,double side3) {
		
		double s = (side1+side2+side3)/2;
		
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.println("The area of the Triangle is: "+area);
		
	}
	public void getPerimeter(int side1,int side2,int side3) {
		System.out.println("The perimeter of the Triangle is: "+(side1+side2+side3));
	}
}

public class AreaofTriangleWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle1 t = new Triangle1();
		t.getPerimeter(10, 5, 7);
		t.getArea(10,5,7);
	}

}
