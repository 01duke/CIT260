
public class A11dot2 {

	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;

	public final static int LECTURER = 1;
	public final static int ASSISTANT_PROFESSOR = 2;
	public final static int ASSOCIATE_PROFESSOR = 3;
	public final static int PROFESSOR = 4;

	public static void main(String[] args) {

		Person person = new Person("Bob Jones", "123 North Main", "555-1234", "bob@bob.com");
		Student student = new Student("Frank Smith", "456 South Main", "555-2345", 
				"frank@frank.com", SOPHOMORE);
		Employee employee = new Employee("George Will", "123 West State", "555-3456", 
				"george@george.com", "123 Smith", 50000, new MyDate(1999, 6, 1));
		Faculty faculty = new Faculty("Sam Boyd", "456 East State", "555-4567", 
				"sam@sam.com", "456 Smith", 80000, new MyDate(1985, 3, 24), 
				"10:00 - 11:00", ASSOCIATE_PROFESSOR);
		Staff staff = new Staff("Chuck Barnes", "789 East State", "555-5678", 
				"chuck@chuck.com", "789 Smith", 100000, new MyDate(2005, 11, 3), 
				"Academic Vice President");

		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);
	}
}

class Person {

	protected String name;
	protected String address;
	protected String phoneNumber; 
	protected String email;

	Person()  {
	}

	Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String toString() {
		return "Person - " + name + ", " + address + ", " + phoneNumber + ", " + email;
	}
}

class Student extends Person {

	protected int status;

	Student ()  {
	}

	Student(String name, String address, String phoneNumber, String email, int status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}

	public String getClass(int status) {
		switch (status)   {
			case A11dot2.FRESHMAN : return "Freshman";
			case A11dot2.SOPHOMORE : return "Sophomore";
			case A11dot2.JUNIOR : return "Junior";
			case A11dot2.SENIOR : return "Senior";
		}
		return "";	
	}
	
	public String toString() {
		return "Student - " + name + ", " + address + ", " + phoneNumber + 
				", " + email + ", " + getClass(status);
	}
}

class Employee extends Person {
	protected String office;
	protected int salary;
	protected MyDate dateHired;

	Employee()  {
	}

	Employee(String name, String address, String phoneNumber, String email, 
			String office, int salary, MyDate dateHired) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public String toString() {
		return "Employee - " + name + ", " + address + ", " + phoneNumber + ", "
				+ email + ", " + office + ", $" + salary + ", " + dateHired;
	}
}

class MyDate {
	int year;
	int month;
	int day;

	MyDate() {
	}

	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String toString()  {
		return month + "/" + day + "/" + year;
	}
}

class Faculty extends Employee {

	protected String officeHours;
	protected int rank;

	Faculty()  {
	}

	Faculty(String name, String address, String phoneNumber, String email, 
			String office, int salary, MyDate dateHired, String officeHours, int rank) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.officeHours = officeHours ;
		this.rank = rank;
	}

	public String getRank(int rank) {
		switch (rank)   {
			case A11dot2.LECTURER : return "Lecturer";
			case A11dot2.ASSISTANT_PROFESSOR  : return "Assistant Professor";
			case A11dot2.ASSOCIATE_PROFESSOR  : return "Associate Professor";
			case A11dot2.PROFESSOR  : return "Professor";
		}
		return "";
	}
	
	public String toString() {
		return "Faculty - " + name + ", " + address + ", " + phoneNumber + ", " + email + 
				", " + office + ", $" + salary + ", " + dateHired + ", " + officeHours + ", " +
				getRank(rank);
	}
}

class Staff extends Employee {
	protected String title;

	Staff()  {
	}

	Staff(String name, String address, String phoneNumber, String email, 
			String office, int salary, MyDate dateHired, String title) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.title = title;
	}

	public String toString() {
		return "Staff - " + name + ", " + address + ", " + phoneNumber + ", " + 
				email + " " + office + ", $" + salary + ", " + dateHired + ", " + title ;
	}
}