package proj1;

public class Employee extends Person implements Comparable<Person>{
	private String deptName;
	private static int numEmployees = 1;
	private int employeeID;
	
	public Employee(){
		super();
		this.deptName = "";
		this.employeeID = numEmployees;
		numEmployees++;
	}
	public Employee(String deptName) {
		super();
		this.deptName = deptName;
		this.employeeID = numEmployees;
		numEmployees++;
;

	}
	public Employee(String name, int birthYear, String deptName){
		super(name, birthYear);
		this.deptName = deptName;
		this.employeeID = numEmployees;
		numEmployees++;

	}
	public String getDeptName() {
		return this.deptName;
	}
	public static int getNumEmployees() {
		return numEmployees;
	}
	public int getEmployeeID() {
		return this.employeeID;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(this == o) {
			return true;
		}
		if(o instanceof Employee) {
			Employee otherEmployee = (Employee)o;
			if (!super.equals(otherEmployee)) {
		    	return false;
		    }
			if(this.deptName.equals(otherEmployee.deptName)) {
				if(this.numEmployees == otherEmployee.numEmployees) {
					if(this.employeeID == otherEmployee.employeeID) {
						return true; 
					}
				}
			}
		}
		return false;
	}
	public String toString() {
		String s = "";
		s += super.toString();
		s += String.format(" Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
		return s;
	}
	public int compareTo(Employee e) {
		if(e == null) {
			return 0;
		}
		if(this.employeeID < e.employeeID) {
			return -1;
		} else if(this.employeeID > e.employeeID) {
			return 1;
		}
		return 0;
	}
}
