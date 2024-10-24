package proj1;

public class Person implements Comparable<Person>{
	private String name;
	private int birthYear;
	
	public Person() {
		this.name = ("");
		this.birthYear = (0);
	}
	public Person(String name, int birthYear) {
		this.name = (name);
		this.birthYear = (birthYear);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(this == o) {
			return true;
		}
		if(o instanceof Person) {
			Person otherPerson = (Person)o;
			if(this.name.equals(otherPerson.name)) {
				if(this.birthYear == otherPerson.birthYear) {
					return true;
				}
			}
		}
		return false;
	}
	public String toString() {
		return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
	}
	public int compareTo(Person p) {
		if(p == null) {
			return 0;
		}
		if(this.birthYear < p.birthYear) {
			return -1;
		} else if(this.birthYear > p.birthYear) {
			return 1;
		}
		return 0;
	}
	
}
