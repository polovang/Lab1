package lab9_Task_1;

public class Student {
    private String id;
    private String name;
    private int year;
	public Student(String id, String name, int year) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	@Override
	public String toString() {
		return "id:" + id + ", name:" + name + ", year:" + year ;
	}
    
}
