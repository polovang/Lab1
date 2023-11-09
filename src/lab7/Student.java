package lab7;

import java.util.ArrayList;

public class Student {
	private String id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private double GPA;

	public Student(String id, String firstName, String lastName, int birthYear, double GPA) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.GPA = GPA;
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
		return "Sid=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear
				+ ", GPA=" + GPA ;
	}
	
	
}
