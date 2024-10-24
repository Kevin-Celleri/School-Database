package proj1;

public class Course implements Comparable<Course>{
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits){
		this.isGraduateCourse = (isGraduateCourse);
		this.courseNum = (courseNum);
		this.courseDept = (courseDept);
		this.numCredits = (numCredits);
	}

	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public String getCourseDept() {
		return courseDept;
	}

	public int getNumCredits() {
		return numCredits;
	}
	public String getCourseName() {
		if(isGraduateCourse) {
			return "G" + this.courseDept + this.courseNum;
		}
		return "U" + this.courseDept + this.courseNum;

	}
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(this == o) {
			return true;
		}
		if(o instanceof Course) {
			Course otherCourse = (Course)o;
			if(this.isGraduateCourse == otherCourse.isGraduateCourse) {
				if(this.courseNum == otherCourse.courseNum) {
					if(this.courseDept.equals(otherCourse.courseDept)) {
						if(this.numCredits == otherCourse.numCredits) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	public String toString() {
		if(isGraduateCourse) {
			return String.format("Course: %3s-%3d | Number of Credits: %02d | Graduate", courseDept, courseNum, numCredits, isGraduateCourse);
		}
		return String.format("Course: %3s-%3d | Number of Credits: %02d | Undergraduate", courseDept, courseNum, numCredits, isGraduateCourse);
	}
	public int compareTo(Course c) {
		if(c == null) {
			return 0;
		}
		if(this.courseNum < c.courseNum) {
			return -1;
		} else if(this.courseNum > c.courseNum) {
			return 1;
		}
		return 0;
	}
}
