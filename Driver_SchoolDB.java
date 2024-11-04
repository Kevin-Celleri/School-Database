

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver_SchoolDB {
	public static void main(String[] args) throws IOException {
		
		
		Scanner sc = new Scanner(System.in);
		Course c1 = new Course(true, 771, "MAT", 4);
		
		Course c2 = new Course(true, 777, "CMP", 4);
		Course c3 = new Course(true, 711, "CMP", 4);
		Course c4 = new Course(true, 723, "MAT", 4);
		Course c5 = new Course(false, 168, "CMP", 4);
		Course c6 = new Course(false, 338, "CMP", 4);

		
		Faculty f1 = new Faculty();
		Faculty f2 = new Faculty(true);
		Faculty f3 = new Faculty("MAT", false);
		Faculty f4 = new Faculty("Superman", 1938, "PHY", true);
		
		Student s1 = new Student();
		Student s2 = new Student(false);
		Student s3 = new Student("Math", false);
		Student s4 = new Student("Wonderwoman", 1941, "JST", true);
		
		GeneralStaff gs1 = new GeneralStaff();
		GeneralStaff gs2 = new GeneralStaff("advise students");
		GeneralStaff gs3 = new GeneralStaff("Sanitation", "clean");
		GeneralStaff gs4 = new GeneralStaff("Flash Gordon", 1934, "Security", "safety");
		
		
		System.out.println("Course: true, 771, MAT, 4");
		System.out.println("Faculty:");
		System.out.println("Faculty: true");
		System.out.println("Faculty: MAT,false");
		System.out.println("Faculty: Superman,1938,PHY,true");
		System.out.println("");
		System.out.println("Student:");
		System.out.println("Student: false");
		System.out.println("Student: Math,false");
		System.out.println("Student: Wonderwoman,1941,JST,true");
		System.out.println("");
		System.out.println("GeneralStaff:");
		System.out.println("GeneralStaff: advise students");
		System.out.println("GeneralStaff: Sanitation,clean");
		System.out.println("GeneralStaff: Flash Gordon,1934,Security,safety");
		System.out.println("");
		System.out.println("Course: true,777,CMP,4");
		System.out.println("Course: true,711,CMP,4");
		System.out.println("Course: true,723,MAT,4");
		System.out.println("Course: false,168,CMP,4");
		System.out.println("Course: false,338,CMP,4");
		System.out.println("");

		
		System.out.println("**************************************************************");
		System.out.println("SCHOOL DATABASE INFO:\n");
		System.out.println("************************************************");
		System.out.println("COURSES:");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());
		System.out.println(c6.toString());
		
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("PERSONS:");
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("EMPLOYEES:");
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("GENERAL STAFF:");
		
		System.out.println(gs1.toString());
		System.out.println(gs2.toString());
		System.out.println(gs3.toString());
		System.out.println(gs4.toString());
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("FACULTY:");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("STUDENTS:");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println("************************************************");
		System.out.println("**************************************************************\n");
		
//		
//		FileWriter w = new FileWriter("SchoolDatabase.txt");
//
//		
//		Course userCourse1 = null;
//		Course userCourse2 = null;
//		Course userCourse3 = null;
//		
//		System.out.println("Create 3 Courses of your choice: \n");
//		String courseDept;
//		int courseDeptNumber;
//		boolean isGraduateCourse;
//		int courseNumCredits;
//		for(int i = 0; i < 3; i++) {
//			
//			System.out.println("Enter your Course Department: ");
//			courseDept = sc.nextLine();
//
//			System.out.println("Enter Course Department Number: ");
//			courseDeptNumber = sc.nextInt();
//			sc.nextLine(); 
//			
//			System.out.println("Is it a Graduate Course? (true/false)");
//			isGraduateCourse = sc.nextBoolean();
//			sc.nextLine(); 
//
//			System.out.println("Enter the Course Credits: ");
//			courseNumCredits = sc.nextInt();
//			sc.nextLine(); 
//			if(i == 0) {
//				userCourse1 = new Course(isGraduateCourse, courseDeptNumber, courseDept, courseNumCredits);
//				w.write("Course: " + isGraduateCourse + ", " + courseDeptNumber + ", " + courseDept + ", " + courseNumCredits + "\n");
//			}
//			if(i == 1) {
//				userCourse2 = new Course(isGraduateCourse, courseDeptNumber, courseDept, courseNumCredits);
//				w.write("Course: " + isGraduateCourse + ", " + courseDeptNumber + ", " + courseDept + ", " + courseNumCredits + "\n");
//			}
//			if(i == 2) {
//				userCourse3 = new Course(isGraduateCourse, courseDeptNumber, courseDept, courseNumCredits);
//				w.write("Course: " + isGraduateCourse + ", " + courseDeptNumber + ", " + courseDept + ", " + courseNumCredits + "\n");
//			}
//		}
//		w.write("\n");
//		
//		Faculty userFaculty1 = null;
//		Faculty userFaculty2 = null;
//		Faculty userFaculty3 = null;
//		
//		System.out.println("Create 3 Faculty members of your choice: \n");
//		String facultyDept;
//		String facultyName;
//		int facultyBirthYear;
//		boolean facultyIsTenured;
//		for(int i = 0; i < 3; i++) {
//			
//			
//			System.out.println("Enter the name of your Faculty member: ");
//			facultyName = sc.nextLine();
//			
//			
//			System.out.println("Enter Faculty member's Birthyear: ");
//			facultyBirthYear = sc.nextInt();
//			sc.nextLine(); 
//			
//			System.out.println("Is the Faculty member tenured?(true/false)");
//			facultyIsTenured = sc.nextBoolean();
//			sc.nextLine(); 
//			
//			System.out.println("Enter the department of your Faculty member: ");
//			facultyDept = sc.nextLine();
//			
//			if(i == 0) {
//				userFaculty1 = new Faculty(facultyName, facultyBirthYear, facultyDept, facultyIsTenured);
//				w.write("Faculty: " + facultyName + ", " + facultyBirthYear + ", " + facultyDept + ", " + facultyIsTenured + "\n");
//			}
//			if(i == 1) {
//				userFaculty2 = new Faculty(facultyName, facultyBirthYear, facultyDept, facultyIsTenured);
//				w.write("Faculty: " + facultyName + ", " + facultyBirthYear + ", " + facultyDept + ", " + facultyIsTenured + "\n");
//			}
//			if(i == 2) {
//				userFaculty3 = new Faculty(facultyName, facultyBirthYear, facultyDept, facultyIsTenured);
//				w.write("Faculty: " + facultyName + ", " + facultyBirthYear + ", " + facultyDept + ", " + facultyIsTenured + "\n");
//			}
//		}
//		w.write("\n");
//		GeneralStaff userGeneralStaff1 = null;
//		GeneralStaff userGeneralStaff2 = null;
//		GeneralStaff userGeneralStaff3 = null;
//		
//		System.out.println("Create 3 General Staff members of your choice: \n");
//		String gsName;
//		int gsBirthYear;
//		String gsDeptName;
//		String gsDuty;
//		for(int i = 0; i < 3; i++) {
//			
//			
//			System.out.println("Enter the name of your General Staff member: ");
//			gsName = sc.nextLine();
//			
//			
//			System.out.println("Enter General Staff member's Birthyear: ");
//			gsBirthYear = sc.nextInt();
//			sc.nextLine(); 
//			
//			System.out.println("Enter the department of the General Staff: ");
//			gsDeptName = sc.nextLine();	
//			
//			System.out.println("What is your member's duty? ");
//			gsDuty = sc.nextLine();
//			
//			if(i == 0) {
//				userGeneralStaff1 = new GeneralStaff(gsName, gsBirthYear, gsDeptName, gsDuty);
//				w.write("General Staff: " + gsName + ", " + gsBirthYear  + ", " + gsDeptName + ", " + gsDuty + "\n");
//			}
//			if(i == 1) {
//				userGeneralStaff2 = new GeneralStaff(gsName, gsBirthYear, gsDeptName, gsDuty);
//				w.write("General Staff: " + gsName + ", " + gsBirthYear  + ", " + gsDeptName + ", " + gsDuty + "\n");
//			}
//			if(i == 2) {
//				userGeneralStaff3 = new GeneralStaff(gsName, gsBirthYear, gsDeptName, gsDuty);
//				w.write("General Staff: " + gsName + ", " + gsBirthYear  + ", " + gsDeptName + ", " + gsDuty + "\n");
//			}
//		}
//		w.write("\n");
//		
//		Student userStudent1 = null;
//		Student userStudent2 = null;
//		Student userStudent3 = null;
//		
//		System.out.println("Create 3 Students of your choice: \n");
//		String studentName;
//		int studentBirthYear;
//		String studentMajor;
//		boolean isGraduate;
//		for(int i = 0; i < 3; i++) {
//			
//			
//			System.out.println("Enter the name of your Student: ");
//			studentName = sc.nextLine();
//
//			
//			System.out.println("Enter the Student's Birthyear: ");
//			studentBirthYear = sc.nextInt();
//			sc.nextLine(); 
//			
//			System.out.println("Is the Student a Graduate?(true/false)");
//			isGraduate = sc.nextBoolean();
//			sc.nextLine(); 
//			
//			System.out.println("Enter the Student's major: ");
//			studentMajor = sc.nextLine();
//			
//			if(i == 0) {
//				userStudent1 = new Student(studentName, studentBirthYear, studentMajor, isGraduate);
//				w.write("Student: " + studentName + ", " + studentBirthYear + ", " + studentMajor + ", " + isGraduate + "\n");
//			}
//			if(i == 1) {
//				userStudent2 = new Student(studentName, studentBirthYear, studentMajor, isGraduate);
//				w.write("Student: " + studentName + ", " + studentBirthYear + ", " + studentMajor + ", " + isGraduate + "\n");
//			}
//			if(i == 2) {
//				userStudent3 = new Student(studentName, studentBirthYear, studentMajor, isGraduate);
//				w.write("Student: " + studentName + ", " + studentBirthYear + ", " + studentMajor + ", " + isGraduate + "\n");
//			}
//		}
// 		
//		userFaculty1.addCourseTaught(userCourse1);
//		userFaculty2.addCourseTaught(userCourse2);
//		
//		userStudent1.addCourseTaken(userCourse1);
//		userStudent2.addCourseTaken(userCourse2);
//		
//		Course[] arr = {userCourse2, userCourse3};
//		
//		userFaculty1.addCoursesTaught(arr);
//		userStudent1.addCoursesTaken(arr);
//		
//		System.out.println("FACULTY | Course at valid index[0]: " + userFaculty1.getCourseTaughtAsString(0));
//		
//		System.out.println("FACULTY | Course at invalid index[-1]: " + userFaculty1.getCourseTaughtAsString(-1));
//		
//		System.out.println("STUDENT | Course at valid index[0]: " + userStudent1.getCourseTakenAsString(0));
//		
//		System.out.println("STUDENT | Course at invalid index[-1]: " + userStudent1.getCourseTakenAsString(-1));
//		
//		System.out.println("Select Faculty member: (Faculty 1, 2 or 3)");
//		int userChosenFaculty = sc.nextInt();
//		if(userChosenFaculty == 1) {
//			System.out.println("Enter one of your created Courses to see if the Faculty Member teaches it: (Courses 1, 2, or 3)");
//			int chosenCourse = sc.nextInt();
//			if(chosenCourse == 1) {
//				System.out.println(userFaculty1.checkForCourseinFacultyArray(userCourse1));
//			}
//			if(chosenCourse == 2) {
//				System.out.println(userFaculty1.checkForCourseinFacultyArray(userCourse2));	
//			}
//			if(chosenCourse == 3) {
//				System.out.println(userFaculty1.checkForCourseinFacultyArray(userCourse3));
//			}
//		}
//		if(userChosenFaculty == 2) {
//			System.out.println("Enter one of your created Courses to see if the Faculty Member teaches it: (1, 2, or 3)");
//			int chosenCourse = sc.nextInt();
//			if(chosenCourse == 1) {
//				System.out.println(userFaculty2.checkForCourseinFacultyArray(userCourse1));
//			}
//			if(chosenCourse == 2) {
//				System.out.println(userFaculty2.checkForCourseinFacultyArray(userCourse2));
//			}
//			if(chosenCourse == 3) {
//				System.out.println(userFaculty2.checkForCourseinFacultyArray(userCourse3));
//			}
//		}
//		if(userChosenFaculty == 3) {
//			System.out.println("Enter one of your created Courses to see if the Faculty Member teaches it: (1, 2, or 3)");
//			int chosenCourse = sc.nextInt();
//			if(chosenCourse == 1) {
//				System.out.println(userFaculty3.checkForCourseinFacultyArray(userCourse1));
//			}
//			if(chosenCourse == 2) {
//				System.out.println(userFaculty3.checkForCourseinFacultyArray(userCourse2));	
//			}
//			if(chosenCourse == 3) {
//				System.out.println(userFaculty3.checkForCourseinFacultyArray(userCourse3));
//			}
//		}
//		
//		int facultyNumCoursesTaught1 = userFaculty1.getNumCoursesTaught();
//		int facultyNumCoursesTaught2 = userFaculty2.getNumCoursesTaught();
//		int facultyNumCoursesTaught3 = userFaculty3.getNumCoursesTaught();
//		
//		System.out.println("************************************************");
//		System.out.println("************************************************");
//		
//		if(facultyNumCoursesTaught1 >= facultyNumCoursesTaught2 && facultyNumCoursesTaught1 >= facultyNumCoursesTaught3) {
//			System.out.println("Faculty 1 teaches the most courses: " + facultyNumCoursesTaught1+ " course(s)");
//		} else if(facultyNumCoursesTaught2 >= facultyNumCoursesTaught1 && facultyNumCoursesTaught2 >= facultyNumCoursesTaught3) {
//			System.out.println("Faculty 2 teaches the most courses: " + facultyNumCoursesTaught2+ " course(s)");
//		} else if(facultyNumCoursesTaught3 >= facultyNumCoursesTaught1 && facultyNumCoursesTaught3 >= facultyNumCoursesTaught2) {
//			System.out.println("Faculty 3 teaches the most courses: " + facultyNumCoursesTaught3+ " course(s)");
//		}
//		if(facultyNumCoursesTaught1 <= facultyNumCoursesTaught2 && facultyNumCoursesTaught1 <= facultyNumCoursesTaught3) {
//			System.out.println("Faculty 1 teaches the least courses: " + facultyNumCoursesTaught1+ " course(s)");
//		} else if(facultyNumCoursesTaught2 <= facultyNumCoursesTaught1 && facultyNumCoursesTaught2 <= facultyNumCoursesTaught3) {
//			System.out.println("Faculty 2 teaches the least courses: " + facultyNumCoursesTaught2+ " course(s)");
//		} else if(facultyNumCoursesTaught3 <= facultyNumCoursesTaught1 && facultyNumCoursesTaught3 <= facultyNumCoursesTaught2) {
//			System.out.println("Faculty 3 teaches the least courses: " + facultyNumCoursesTaught3+ " course(s)");
//		}
//		
//		System.out.println("************************************************");
//		System.out.println("************************************************");
//		
//		
//		if(userCourse1.compareTo(userCourse2) >= 0 && userCourse1.compareTo(userCourse3) >= 0) {
//			System.out.println("Course 1 is the maximum in the catalog");
//		} else if(userCourse2.compareTo(userCourse1) >= 0 && userCourse2.compareTo(userCourse3) >= 0) {
//			System.out.println("Course 2 is the maximum in the catalog");
//		} else if(userCourse3.compareTo(userCourse1) >= 0 && userCourse3.compareTo(userCourse2) >= 0) {
//			System.out.println("Course 3 is the maximum in the catalog");
//		}
//		
//		if(userCourse1.compareTo(userCourse2) <= 0 && userCourse1.compareTo(userCourse3) <= 0) {
//			System.out.println("Course 1 is the minimum in the catalog");
//		} else if(userCourse2.compareTo(userCourse1) <= 0 && userCourse2.compareTo(userCourse3) <= 0) {
//			System.out.println("Course 2 is the minimum in the catalog");
//		} else if(userCourse3.compareTo(userCourse1) <= 0 && userCourse3.compareTo(userCourse2) <= 0) {
//			System.out.println("Course 3 is the minimum in the catalog");
//		}
//		
//		System.out.println("************************************************");
//		System.out.println("************************************************");
//		
//		int studentCredits1 = userStudent1.getNumCredits();
//		int studentCredits2 = userStudent2.getNumCredits();
//		int studentCredits3 = userStudent3.getNumCredits();
//		
//		if(userStudent1.compareTo(userStudent2) >= 0 && userStudent1.compareTo(userStudent3) >= 0) {
//			System.out.println("Student 1 has the most credits: " + studentCredits1 + " credits");
//		} else if(userStudent2.compareTo(userStudent1) >= 0 && userStudent2.compareTo(userStudent3) >= 0) {
//			System.out.println("Student 2 has the most credits: " + studentCredits2 + " credits");
//		} else if(userStudent3.compareTo(userStudent1) >= 0 && userStudent3.compareTo(userStudent2) >= 0) {
//			System.out.println("Student 3 has the most credits: " + studentCredits3 + " credits");
//		}
//		
//		if(userStudent1.compareTo(userStudent2) <= 0 && userStudent1.compareTo(userStudent3) <= 0) {
//			System.out.println("Student 1 has the least credits: " + studentCredits1 + " credits");
//		} else if(userStudent2.compareTo(userStudent1) <= 0 && userStudent2.compareTo(userStudent3) <= 0) {
//			System.out.println("Student 2 has the least credits: " + studentCredits2 + " credits");
//		} else if(userStudent3.compareTo(userStudent1) <= 0 && userStudent3.compareTo(userStudent2) <= 0) {
//			System.out.println("Student 3 has the least credits: " + studentCredits3 + " credits");
//		}
//		System.out.println("************************************************");
//		System.out.println("************************************************");
//		
//		System.out.println("COURSES: ");
//		System.out.println(userCourse1.toString());
//		System.out.println(userCourse2.toString());
//		System.out.println(userCourse3.toString());
//		System.out.println("************************************************");
//		System.out.println("************************************************");
//		System.out.println("FACULTY: ");
//		System.out.println(userFaculty1.toString());
//		System.out.println(userFaculty2.toString());
//		System.out.println(userFaculty3.toString());
//		System.out.println("************************************************");
//		System.out.println("************************************************");
//		System.out.println("GENERAL STAFF: ");
//		System.out.println(userGeneralStaff1.toString());
//		System.out.println(userGeneralStaff2.toString());
//		System.out.println(userGeneralStaff3.toString());
//		System.out.println("************************************************");
//		System.out.println("************************************************");
//		System.out.println("STUDENTS: ");
//		System.out.println(userStudent1.toString());
//		System.out.println(userStudent2.toString());
//		System.out.println(userStudent3.toString());
//		System.out.println("************************************************");
//		System.out.println("************************************************");
//		
//		w.close();
		
	}
}
