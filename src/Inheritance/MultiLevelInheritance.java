package Inheritance;

class Arr
{
	public Arr(int a) {
		super();
		this.a = a;
	}

	int a =10;
}

class B1 extends A{
	public B1(int A) {
		super(A);
		// TODO Auto-generated constructor stub
	}

	int b=20;
	
}

class C1 extends B{
	public C1(int A) {
		super(A);
		// TODO Auto-generated constructor stub
	}

	int c=30;
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1(1);
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
	}

}
