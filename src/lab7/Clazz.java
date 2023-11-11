package lab7;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class Clazz {
	private String name;
	private String year;
	private ArrayList<Student> students = new ArrayList<Student>();



	// Thêm sinh viên từ file vào danh sách sinh viên của lớp
	public void loadStudent(String fileName) {
		try {
			ArrayList<Student> loadedStudents = StudentUtils.loadStudents(fileName);
			students.addAll(loadedStudents);
			System.out.println("Students successfully");
			for(Student student : students) {
				System.out.println(student.toString());
			}
		} catch (IOException e) {
			System.out.println("Error loading students from file: " + e.getMessage());
		}
	}

	// Sắp xếp danh sách sinh viên theo trình tự được chỉ định bởi bộ so sánh c
	public void sortStudents(Comparator<Student> c) {
		students.sort(c);
	}

	// Lấy danh sách n sinh viên có GPA cao nhất
	public ArrayList<Student> getTopNStudents(int n) {
		ArrayList<Student> topStudent= new ArrayList<Student>();
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.getGPA(), o1.getGPA());
			}	});
		for(int i=0;i<n;i++) {
			topStudent.add(students.get(i));
		}
		return topStudent;
        
	}

	// Lấy danh sách n sinh viên ngẫu nhiên từ danh sách sinh viên
	public ArrayList<Student> getRandomNStudents(int n) {
		ArrayList<Student> randomStudents = new ArrayList<Student>();
		ArrayList<Student> cloneStudents = new ArrayList<Student>(students);
		Random random = new Random();

		int size = Math.min(n, students.size());
		for (int i = 0; i < size; i++) {
			int index = random.nextInt(cloneStudents.size());
			randomStudents.add(cloneStudents.remove(index));
		}

		return randomStudents;
	}

	// Xóa sinh viên với mã số sinh viên đã cho
	public boolean removeStudent(String id) {
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getId().equals(id)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	// Lấy danh sách sinh viên sinh năm cho trước
	public ArrayList<Student> getStudentByBirthYear(int birthYear) {
		ArrayList<Student> result = new ArrayList<Student>();
		for (Student student : students) {
			if (student.getBirthYear() == birthYear) {
				result.add(student);
			}
		}
		return result;
	}

	// Hiển thị tên lớp, năm học và thông tin của tất cả sinh viên trong lớp
	public void display() {
		System.out.println("Class: " + name + " - Year: " + year);
		System.out.println("Students:");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
	public static void main(String[] args) {
		Clazz clazz = new Clazz();
		clazz.loadStudent("fol/Student.txt");
		System.out.println("N student has GPA hightest");
		System.out.println(clazz.getTopNStudents(2));
		System.out.println("Take student has year");
		System.out.println(clazz.getStudentByBirthYear(1993));
		
	}
}