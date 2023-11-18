package lab9_Task_1;

import java.util.List;



public class Course {
	private String id;
	private String titile;
	private String type;
	private List<Student> student;
	private String lecturer;
	public Course(String id, String titile, String type, List<Student> student, String lecturer) {
		super();
		this.id = id;
		this.titile = titile;
		this.type = type;
		this.student = student;
		this.lecturer = lecturer;
	}
	public String getId() {
		return id;
	}
	public String getTitile() {
		return titile;
	}
	public String getType() {
		return type;
	}
	public List<Student> getStudent() {
		return student;
	}
	public String getLecturer() {
		return lecturer;
	}
	@Override
	public String toString() {
		return "id:" + id + ", titile:" + titile + ", type:" + type + ", student:" + student + ", lecturer:"
				+ lecturer ;
	}
	

}
