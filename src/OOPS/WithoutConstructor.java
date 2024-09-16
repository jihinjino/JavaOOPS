package OOPS;


class Stu{
//	String Sname;
//	int rollno;
	
	public void setValues(String name,int roll) {

		System.out.println(name);
		System.out.println(roll);
		
	}
}
public class WithoutConstructor {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s1 = new Stu();
		
		s1.setValues("Jihiiii", 12);
		

	}

}
