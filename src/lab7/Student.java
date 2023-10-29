package lab7;

public class Student {
	private String id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private double GPA;
	public Student(String id, String firstName, String lastName, int birthYear, double gPA) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		GPA = gPA;
	}
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public double getGPA() {
		return GPA;
	}
	@Override
	public String toString() {
		return "id" + id + ", firstName" + firstName + ", lastName" + lastName + ", birthYear" + birthYear
				+ ", GPA" + GPA;
	}
	
	

}
