package lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.List;

public class clazz {
	private String name;
	private String year;
	private ArrayList<Student> st = new ArrayList<Student>();



	public void loadStudents(String fileName) {

		try {
			List<String> line = Files.readAllLines(Path.of(fileName));
			for (String lines : line) {
				String[] check = lines.split("");
				if (check.length == 5) {
					String id = check[0];
					String firstName = check[1];
					String lastName = check[2];
					int birthYear = Integer.parseInt(check[3]);
					double GPA = Double.parseDouble(check[4]);
					Student student = new Student(id, firstName, lastName, birthYear, GPA);
					st.add(student);
					System.out.println(st.toString());
				}
				System.out.println("cm");
			}
		} catch (IOException e) {
			System.out.println("");

		}
	
	
		
	}
}
