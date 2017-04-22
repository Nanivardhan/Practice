import java.util.Scanner;

public class EmployeeServiceImpl implements PersonService {

	

	public void register() {

		Employee employee = new Employee();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Employee data...");
		System.out.println("Enter the Employee Id::");
		employee.setId(sc.nextInt());
		System.out.println("Enter the Employee Name::");
		employee.setName(sc.next());
		System.out.println("Enter the Employee Company Name::");
		employee.setCompanyName(sc.next());
		System.out.println("Enter the Employee Salary::");
		employee.setSalary(sc.nextLong());

	}

	public void display() {

		System.err.println("Available Employee Data is::");
		System.out.println(id + "," + Name + "," + CompanyName + "," + Salary);
	}

}
