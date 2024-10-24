package proj1;


public class Faculty extends Employee implements Comparable<Person>{
	private Course[] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;
	
	public Faculty() {
		this.coursesTaught = new Course[100];
		this.numCoursesTaught = 0;
		this.isTenured = false;
	}
	public Faculty(boolean isTenured) {
		this.coursesTaught = new Course[100];
		this.coursesTaught = new Course[100];
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}
	public Faculty(String deptName, boolean isTenured){
		super(deptName);
		this.isTenured = isTenured;
		this.coursesTaught = new Course[100];

	}
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		super(name, birthYear, deptName);
		this.coursesTaught = new Course[100];

		this.isTenured = isTenured;
	}
	public boolean isTenured() {
		return this.isTenured;
	}
	public int getNumCoursesTaught() {
		return this.numCoursesTaught;
	}
	public void setIsTenured(boolean isTenured){
		this.isTenured = isTenured;
	}
	public void addCourseTaught(Course course) {
		for(int i = 0; i < coursesTaught.length; i++) {
			if(coursesTaught[i] == null) {
				coursesTaught[i] = course;
				this.numCoursesTaught++;
				break;
			}
		}
	}
	public void addCoursesTaught(Course [] courses){

		for(int i = 0; i < courses.length; i++) {
			addCourseTaught(courses[i]);
		}
		
	}
//	public void addCourseTaught(Course course) {
//		if(course != null && numCoursesTaught < coursesTaught.length) {
//				coursesTaught[numCoursesTaught] = course;
//				this.numCoursesTaught++;
//		}
//		
//	}
//	public void addCoursesTaught(Course [] courses){
//		for(int i = 0; i < courses.length; i++) {
//			addCourseTaught(courses[i]);
//		}
//		
//		
//	}
	public Course getCourseTaught(int index){
		if(index < 0 || index >= coursesTaught.length) {
			return null;
		}
		return coursesTaught[index];
	}
	public String getCourseTaughtAsString(int index){
		if(index < 0 || index >= coursesTaught.length) {
			return "";
		}
		String s = coursesTaught[index].getCourseDept() + "-" + coursesTaught[index].getCourseNum();
		return s;
	}
	public String getAllCoursesTaughtAsString() {
		String s = "";
		for(int i = 0; i < coursesTaught.length; i++) {
			if(coursesTaught[i] != null) {
				if(coursesTaught[i + 1] != null) {
					s += getCourseTaughtAsString(i) + ", ";
				} else {
					s += getCourseTaughtAsString(i);
				}
			}
		}
		return s;
	}
	public boolean equals (Object o) {
		if(o == null) {
			return false;
		}
		if(this == o)
		{
			return true;
		}
		if(o instanceof Faculty) {
			Faculty otherFaculty = (Faculty)o;
			if (!super.equals(otherFaculty)) {
		    	return false;
		    }
			if(this.coursesTaught == otherFaculty.coursesTaught) {
				if(this.numCoursesTaught == otherFaculty.numCoursesTaught) {
					if(this.isTenured == otherFaculty.isTenured) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public String toString() {
		String s = "";
		s+= super.toString();
		if(isTenured) {
			s += String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", "Is Tenured" , numCoursesTaught, getAllCoursesTaughtAsString() );
		} else {
			s += String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", "Not Tenured" , numCoursesTaught, getAllCoursesTaughtAsString() );
		}
		return s;
	}
	public int compareTo(Person p) {
		if(p == null) {
			return 0;
		}
		Faculty personFaculty = (Faculty)p;
		if(this.numCoursesTaught < personFaculty.numCoursesTaught) {
			return -1;
		} else if(this.numCoursesTaught > personFaculty.numCoursesTaught) {
			return 1;
		}
		return 0;
	}
}
