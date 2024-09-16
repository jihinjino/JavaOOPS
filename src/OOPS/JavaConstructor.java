package OOPS;


class Student1{
	
	
	public Student1(String Name,int rollno) {
		
		System.out.println(Name);
		System.out.println(rollno);		
	}
}
public class JavaConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1 = new Student1("Jihin",12);
		
		Student1 s2 = new Student1("Rajesh",14);
	}

}
