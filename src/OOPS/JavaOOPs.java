package OOPS;


class Student{
	String SName;
	int Rollno;
	
	public void Exam() {
		System.out.println(SName);
		System.out.println(Rollno);
	}
}


public class JavaOOPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.SName ="Jihin";
		s1.Rollno = 12;
		s1.Exam();
	}

}
