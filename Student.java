package proj1;


public class Student extends Person implements Comparable<Person>{
	private static int numStudents = 0;
	private int studentID;
	private Course[] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major;

	public Student() {
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = false;
		this.major = "undeclared";
		numStudents++;
		this.studentID = numStudents;

	}
	public Student(boolean isGraduate) {
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.major = "undeclared";
		numStudents++;
		this.studentID = numStudents;

	}
	public Student(String major, boolean isGraduate) {
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.major = major;
		numStudents++;
		this.studentID = numStudents;

	}
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		super(name, birthYear);
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.major = major;
		numStudents++;
		this.studentID = numStudents;


	}
	public boolean isGraduate() {
		return this.isGraduate;
	}
	public int getNumCoursesTaken() {
		
		return this.numCoursesTaken;
		
	}
	public static int getNumStudents() {
		return numStudents;
	}
	public int getStudentID() {
		return this.studentID;
	}
	public String getMajor() {
		return this.major;
	}
	public void setIsGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void addCourseTaken(Course course) {
		for(int i = 0; i < coursesTaken.length; i++) {
			if(coursesTaken[i] == null) {
				coursesTaken[i] = course;
				this.numCoursesTaken++;
				break;
			}
		}
	}
	public void addCoursesTaken(Course [] courses){

		for(int i = 0; i < courses.length; i++) {
			addCourseTaken(courses[i]);
		}
		
	}
	public Course getCourseTaken(int index){
		if(index < 0 || index >= coursesTaken.length) {
			return null;
		}
		return coursesTaken[index];
	}
	public String getCourseTakenAsString(int index){
		if(index < 0 || index >= coursesTaken.length) {
			return "";
		}
		String s = coursesTaken[index].getCourseDept() + "-" + coursesTaken[index].getCourseNum();
		return s;
	}
	public String getAllCoursesTakenAsString() {
		String s = "";
		for(int i = 0; i < coursesTaken.length; i++) {
			if(coursesTaken[i] != null) {
				if(coursesTaken[i + 1] != null) {
					s += getCourseTakenAsString(i) + ", ";
				} else {
					s += getCourseTakenAsString(i);
				}
			}
		}
		return s;
	}
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(this == o) {
			return true;
		}
		if(o instanceof Student) {
			Student otherStudent = (Student)o;
			if(!super.equals(otherStudent)) {
				return false;
			}
			if(this.numStudents == otherStudent.numStudents) {
				if(this.studentID == otherStudent.studentID) {
					if(this.coursesTaken == otherStudent.coursesTaken) {
						if(this.numCoursesTaken == otherStudent.numCoursesTaken) {
							if(this.isGraduate == otherStudent.isGraduate) {
								if(this.major.equals(otherStudent.major)) {
									return true;
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
	public String toString() {
		String s = "";
		s += super.toString();
		if(isGraduate) {
			s += String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, "Graduate", numCoursesTaken, getAllCoursesTakenAsString() );
		} else {
			s += String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, "Undergraduate", numCoursesTaken, getAllCoursesTakenAsString() );
		}
		return s;
	}
	public int getNumCredits() {
		int numCredits = 0;
		for(int i =0; i < coursesTaken.length; i++) {
			if(coursesTaken[i] != null) {
				numCredits += coursesTaken[i].getNumCredits();
			}
		}
		return numCredits;
	}
	public int compareTo(Person p) {
		if(p == null) {
			return 0;
		}
		Student personStudent = (Student)p;
		if(this.getNumCredits() < personStudent.getNumCredits()) {
			return -1;
		} else if(this.getNumCredits() > personStudent.getNumCredits()) {
			return 1;
		}
		return 0;
	}
	
}
