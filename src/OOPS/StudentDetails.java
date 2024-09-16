package OOPS;

import java.util.Scanner;

class studentDet{
	
//	public String name;
//	public int rollno;
//	
	public void showDetails(String name,int rollno) {
		System.out.println("Student name: "+name);
		System.out.println("Student rollno: "+rollno);
	}
	
	
}

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		studentDet s = new studentDet();
		System.out.print("Enter the student name: ");
		String name =sc.nextLine();
		System.out.print("Enter the roll no: ");
		int rollno = sc.nextInt();
		s.showDetails(name, rollno);
		
	}

}
