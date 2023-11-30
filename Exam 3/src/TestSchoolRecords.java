
import java.util.ArrayList;
import java.util.Scanner;

public class TestSchoolRecords {

	public static void printPersonInfo(Person person) {
		System.out.println("Name: " + person.getName());
		System.out.println("Address: " + person.getAddress());
		System.out.println("Phone Number: " + person.getPhoneNumber());
		System.out.println("Email Address: " + person.getEmailAddress());

		if (person instanceof Student) {
			System.out.println("Status: " + ((Student) person).getStatus());
		} else if (person instanceof Faculty) {
			Faculty faculty = (Faculty) person;
			System.out.println("Office: " + faculty.getOffice());
			System.out.println("Salary: $" + faculty.getSalary());
			System.out.println("Date Hired: " + faculty.getDateHired());
			System.out.println("Office Hours: " + faculty.getOfficeHours());
			System.out.println("Rank: " + faculty.getRank());
		} else if (person instanceof Staff) {
			Staff staff = (Staff) person;
			System.out.println("Office: " + staff.getOffice());
			System.out.println("Salary: $" + staff.getSalary());
			System.out.println("Date Hired: " + staff.getDateHired());
			System.out.println("Title: " + staff.getTitle());
		}

		System.out.println("----------------------------");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Person> persons = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter details for Student " + (i + 1) + ":");
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Address: ");
			String address = scanner.nextLine();
			System.out.print("Phone Number: ");
			String phoneNumber = scanner.nextLine();
			System.out.print("Email Address: ");
			String emailAddress = scanner.nextLine();
			System.out.print("Status (freshman, sophomore, junior, or senior): ");
			String status = scanner.nextLine();

			persons.add(new Student(name, address, phoneNumber, emailAddress, status));
		}

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter details for Faculty " + (i + 1) + ":");
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Address: ");
			String address = scanner.nextLine();
			System.out.print("Phone Number: ");
			String phoneNumber = scanner.nextLine();
			System.out.print("Email Address: ");
			String emailAddress = scanner.nextLine();
			System.out.print("Office: ");
			String office = scanner.nextLine();
			System.out.print("Salary: ");
			double salary = Double.parseDouble(scanner.nextLine());
			System.out.print("Date Hired: ");
			String dateHired = scanner.nextLine();
			System.out.print("Office Hours: ");
			String officeHours = scanner.nextLine();
			System.out.print("Rank (junior or senior): ");
			String rank = scanner.nextLine();

			persons.add(new Faculty(name, address, phoneNumber, emailAddress, office, salary, dateHired, officeHours,
					rank));
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter details for Staff " + (i + 1) + ":");
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Address: ");
			String address = scanner.nextLine();
			System.out.print("Phone Number: ");
			String phoneNumber = scanner.nextLine();
			System.out.print("Email Address: ");
			String emailAddress = scanner.nextLine();
			System.out.print("Office: ");
			String office = scanner.nextLine();
			System.out.print("Salary: ");
			double salary = Double.parseDouble(scanner.nextLine());
			System.out.print("Date Hired: ");
			String dateHired = scanner.nextLine();
			System.out.print("Title: ");
			String title = scanner.nextLine();

			persons.add(new Staff(name, address, phoneNumber, emailAddress, office, salary, dateHired, title));
		}

		for (Person person : persons) {
			printPersonInfo(person);
		}

		scanner.close();
	}
}
