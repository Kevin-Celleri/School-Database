package proj1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver_SchoolDB {
	public static void main(String[] args) {
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
		
		
		Course userCourse1 = null;
		Course userCourse2 = null;
		Course userCourse3 = null;
		
		System.out.println("Create 3 Courses of your choice: \n");
		String courseDept;
		int courseDeptNumber;
		boolean isGraduateCourse;
		int courseNumCredits;
		for(int i = 0; i < 3; i++) {
			courseDept = "";
			courseDeptNumber = 0;
			isGraduateCourse = true;
			courseNumCredits = 0;
			System.out.println("Enter your Course Department: ");
			while(true) {
				try {
					courseDept = sc.nextLine();
					break;
				} catch(InputMismatchException e) {
					System.out.println("Enter valid input (Integer).");
				}
			}
			System.out.println("Enter Course Department Number: ");
			courseDeptNumber = sc.nextInt();
			System.out.println("Is it a Graduate Course? (true/false)");
			boolean continueLoop = true;
			while(continueLoop) {
				try {
					isGraduateCourse = sc.nextBoolean();
					
				} catch(InputMismatchException e) {
					System.out.println("Enter valid input: (true/false).");
					continueLoop = false;
				}
			}
			System.out.println("Enter the Course Credits: ");
			courseNumCredits = sc.nextInt();
			if(i == 0) {
				userCourse1 = new Course(isGraduateCourse, courseDeptNumber, courseDept, courseNumCredits);
			}
			if(i == 1) {
				userCourse2 = new Course(isGraduateCourse, courseDeptNumber, courseDept, courseNumCredits);
			}
			if(i == 2) {
				userCourse3 = new Course(isGraduateCourse, courseDeptNumber, courseDept, courseNumCredits);
			}
		}
		
		Faculty userFaculty1 = null;
		Faculty userFaculty2 = null;
		Faculty userFaculty3 = null;
		
		System.out.println("Create 3 Faculty members of your choice: \n");
		String facultyDept;
		String facultyName;
		int facultyBirthYear;
		boolean facultyIsTenured;
		for(int i = 0; i < 3; i++) {
			facultyDept = "";
			facultyName = "";
			facultyBirthYear = 0;
			facultyIsTenured = true;
			
			System.out.println("Enter the name of your Faculty member: ");
			facultyName = sc.nextLine();
			
			
			System.out.println("Enter Faculty member's Birthyear: ");
			facultyBirthYear = sc.nextInt();
			
			
			System.out.println("Is the Faculty member tenured?(true/false)");
			facultyIsTenured = sc.nextBoolean();

			
			System.out.println("Enter the department of your Faculty member: ");
			facultyName = sc.nextLine();
			
			
			if(i == 0) {
				userFaculty1 = new Faculty(facultyName, facultyBirthYear, facultyDept, facultyIsTenured);
			}
			if(i == 1) {
				userFaculty2 = new Faculty(facultyName, facultyBirthYear, facultyDept, facultyIsTenured);
			}
			if(i == 2) {
				userFaculty3 = new Faculty(facultyName, facultyBirthYear, facultyDept, facultyIsTenured);
			}
		}
		GeneralStaff userGeneralStaff1 = null;
		GeneralStaff userGeneralStaff2 = null;
		GeneralStaff userGeneralStaff3 = null;
		
		System.out.println("Create 3 General Staff members of your choice: \n");
		String gsName;
		int gsBirthYear;
		String gsDeptName;
		String gsDuty;
		for(int i = 0; i < 3; i++) {
			gsName = "";
			gsBirthYear = 0;
			gsDeptName = "";
			gsDuty = "";
			
			System.out.println("Enter the name of your General Staff member: ");
			gsName = sc.nextLine();
			
			
			System.out.println("Enter General Staff member's Birthyear: ");
			gsBirthYear = sc.nextInt();
			
			
			System.out.println("Enter the department of the General Staff: ");
			gsDeptName = sc.nextLine();	
				
			
			System.out.println("What is your member's duty? ");
			gsDuty = sc.nextLine();
			
			
			if(i == 0) {
				userGeneralStaff1 = new GeneralStaff(gsName, gsBirthYear, gsDeptName, gsDuty);
			}
			if(i == 1) {
				userGeneralStaff2 = new GeneralStaff(gsName, gsBirthYear, gsDeptName, gsDuty);
			}
			if(i == 2) {
				userGeneralStaff3 = new GeneralStaff(gsName, gsBirthYear, gsDeptName, gsDuty);
			}
		}
		
		
		Student userStudent1 = null;
		Student userStudent2 = null;
		Student userStudent3 = null;
		
		System.out.println("Create 3 Students of your choice: \n");
		String studentName;
		int studentBirthYear;
		String studentMajor;
		boolean isGraduate;
		for(int i = 0; i < 3; i++) {
			studentName = "";
			studentBirthYear = 0;
			studentMajor = "";
			isGraduate = true;
			
			System.out.println("Enter the name of your Student: ");
			studentName = sc.nextLine();

			
			System.out.println("Enter the Student's Birthyear: ");
			studentBirthYear = sc.nextInt();
			
			
			System.out.println("Is the Student a Graduate?(true/false)");
			isGraduate = sc.nextBoolean();
			
			
			System.out.println("Enter the Student's major: ");
			studentMajor = sc.nextLine();
			
			
			if(i == 0) {
				userStudent1 = new Student(studentName, studentBirthYear, studentMajor, isGraduate);
			}
			if(i == 1) {
				userStudent2 = new Student(studentName, studentBirthYear, studentMajor, isGraduate);
			}
			if(i == 2) {
				userStudent3 = new Student(studentName, studentBirthYear, studentMajor, isGraduate);
			}
		}
		
		userFaculty1.addCourseTaught(userCourse1);
		userFaculty2.addCourseTaught(userCourse2);
		
		userStudent1.addCourseTaken(userCourse1);
		userStudent2.addCourseTaken(userCourse2);
		
		Course[] arr = {userCourse2, userCourse3};
		
		userFaculty1.addCoursesTaught(arr);
		userStudent1.addCoursesTaken(arr);

		
		
	}
}
