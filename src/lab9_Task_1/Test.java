package lab9_Task_1;


import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Student student1 = new Student("11", "A", 2012);
		Student student2 = new Student("11", "V", 2012);
		Student student3 = new Student("11", "D", 2014);
		Student student4= new Student("11", "G", 2015);
		List<Student> st =new ArrayList<>();
		List<Student> st1 =new ArrayList<>();
		List<Student> st2=new ArrayList<>();
		st.add(student1);
		st.add(student2);
		st.add(student3);
		st.add(student4);
		
		st1.add(student1);
		st1.add(student2);
		st1.add(student3);
		
		st2.add(student3);
		st2.add(student4);
		
		
		Course course1 = new Course("11", "Z1", "Thuc hanh", st, "C");
		Course course2 = new Course("11", "Z", "Thuc hanh", st, "C");
		Course course3 = new Course("11", "Z", "Li thuyet", st, "C");
		
		List<Course> c = new ArrayList<>();
		List<Course> c1 = new ArrayList<>();
		List<Course> c2 = new ArrayList<>();
		c.add(course1);
		c.add(course2);
		c.add(course3);
		
		c1.add(course1);
		c1.add(course2);
		
		c2.add(course2);
		c2.add(course3);
		
		Faculty faculty1= new Faculty(null, null, c);
		Faculty faculty2= new Faculty(null, null, c1);
		Faculty faculty3= new Faculty(null, null, c2);
		
		System.out.println(faculty1.getmaxPracticalCourse());
		System.out.println("List student with year:");
		System.out.println(faculty2.groupStudentByYear());
		System.out.println("List course with type, deccrease with quanlity student register:");
		System.out.println(faculty3.filterCourse("Thuc hanh"));
	}

}
