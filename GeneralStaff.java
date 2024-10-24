package proj1;

public class GeneralStaff extends Employee{
	private String duty;
	
	public GeneralStaff() {
		this.duty = "";
	}
	public GeneralStaff(String duty) {
		this.duty = duty;
	}
	public GeneralStaff(String deptName, String duty) {
		super(deptName);
		this.duty = duty;
	}	
	public GeneralStaff(String name, int birthYear, String deptName, String duty){
		super(name, birthYear, deptName);
		this.duty = duty;
	}
	public String getDuty() {
		return this.duty;
	}
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(this == o) {
			return true;
		}
		if(o instanceof GeneralStaff) {
			GeneralStaff otherGeneralStaff = (GeneralStaff)o;
			if(!super.equals(otherGeneralStaff)) {
				return false;
			}
			if(this.duty == otherGeneralStaff.duty) {
				return true;
			}
		}
		return false;
	}
	public String toString() {
		String s = "";
		s += super.toString();
		s += String.format(" GeneralStaff: Duty: %10s", duty);
		return s;
	}
}
