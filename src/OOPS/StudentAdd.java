package OOPS;

import java.util.Scanner;

class studentAddDetails{
	public String name;
	public String address;
	
	public void Method() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=n;i++) {
			
			studentAddDetails s = new studentAddDetails();
			System.out.print("Enter the student "+i+ " name: ");
			String name =sc.nextLine();
			System.out.print("Enter the Address: ");
			String address = sc.nextLine();
			s.addDetails(name, address);
		}
	}
	
	public void addDetails(String name,String address) {
		System.out.println("Student name: "+name);
		System.out.println("Student rollno: "+address);
	}
}


public class StudentAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentAddDetails s = new studentAddDetails();	
		s.Method();
		}
}
