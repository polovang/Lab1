package lab9_Task_1;
    import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.HashMap;
    import java.util.List;
	import java.util.Map;
	import java.util.Set;
	import java.util.TreeSet;
	public class Faculty {
		private String name;
		private String address;
		private List<Course> courses;

		public Faculty(String name, String address, List<Course> courses) {

			this.name = name;
			this.address = address;
			this.courses = courses;
		}

		public Course getmaxPracticalCourse() {
			Course course = null;
			int max = 0;
			for (Course cou : courses) {
				if (cou.getType().equals("Thuc hanh") && cou.getStudent().size() > max) {
					max = cou.getStudent().size();
					course = cou;
				}
			}
			return course;

		}

		public Map<Integer, List<Student>> groupStudentByYear() {
			Map<Integer, List<Student>> re = new HashMap<>();
			for (Course cou : courses) {
				for (Student st : cou.getStudent()) {
					int year = st.getYear();
					if (!re.containsKey(year)) {
						re.put(year, new ArrayList<>());

					}
					re.get(year).add(st);

				}

			}
			return re;
		}
		public Set<Course> filterCourse(String type){
			
			List<Course> course = new ArrayList<>();
			for(Course cou: courses) {
				if(cou.getType().equals(type)) {
					course.add(cou);
					
				}
			}
			Set<Course> re = new TreeSet<Course>(new Comparator<Course>() {

				@Override
				public int compare(Course o1, Course o2) {
					// TODO Auto-generated method stub
					return o2.getStudent().size()-o1.getStudent().size();
				}
			});
			for(Course course2: course) {
				re.add(course2);
			}
			return re;
			
		}

	}

	

	





