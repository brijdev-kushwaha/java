package AdvMethod;

public class Employee {
	private final String name;
	
	private final int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = 0;
	}
	public String getName() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Employee");
		sb.append("name : \n").append(name);
		sb.append("salary: ").append(salary);
		
		return sb.toString();
	}

}
