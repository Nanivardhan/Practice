import java.util.Scanner;

import org.omg.CORBA.Request;

public class StudentServiceImpl implements PersonService {

	Scanner sc = new Scanner(System.in);
	
	public void register() {
		
		Student student = new Student();
		System.out.println("Please Enter the Student Details...");
		System.out.println("Enter the Student Roll Number:: ");
		student.setRollno(sc.next());
		System.out.println("Enter Student Name::");
		student.setName(sc.next());
		System.out.println("Enter Graduation::");
		student.setGraduation(sc.next());
		System.out.println("Enter Stream::");
		student.setStream(sc.next());
	}

	@Override
	public void display() {
		
		System.out.println("Available Student Data is::");	
		System.out.println(rollno+","+name+","+graduation+","+stream);
		
	}

	
}
