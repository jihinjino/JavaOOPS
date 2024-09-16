package OOPS;

class Rectangle{
	
	
	public void Area(int length,int breadth) {
		System.out.println("The Area of the Rectangle: "+(length*breadth));
	}
}

public class AreaofTwoRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle();
		r.Area(4, 5);
		r.Area(5, 8);
	}

}
