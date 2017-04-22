import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Available Modules are: ");
		System.out.println("1.Employee");
		System.out.println("2.Student");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Module: ");
		String module = sc.nextLine();

		System.out.println("Available Options are:");
		System.out.println("1.Register");
		System.out.println("2.Display");
		System.out.println("Please select option: ");
		String option = sc.nextLine();
		PersonService person = null;
		if (module.equalsIgnoreCase("Employee") || module.equalsIgnoreCase("1")) {
			person = new EmployeeServiceImpl();
			if (option.equalsIgnoreCase("Register") || option.equalsIgnoreCase("1")) {
				person.register();
			}
			if (option.equalsIgnoreCase("Display") || option.equalsIgnoreCase("2")) {
				person.display();
			}
		}
		if (module.equalsIgnoreCase("Student") || module.equalsIgnoreCase("2")) {
			person = new StudentServiceImpl();
			if (option.equalsIgnoreCase("Register") || option.equalsIgnoreCase("1")) {
				person.register();
			}
			if (option.equalsIgnoreCase("Display") || option.equalsIgnoreCase("2")) {
				person.display();
			}
		}
	}

}
