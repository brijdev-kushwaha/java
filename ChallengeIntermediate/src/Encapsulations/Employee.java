package Encapsulations;

public class Employee {
	private String name;
	private String age;
	private String salary;
	
	Employee(String name, String age , String salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	String EmployeeDetails() {
		return "EmployeeDetails: Name:" + name + ", Age:" + age + ", Salary:"+ salary+"";
	}
	
	public String getName() {
		return name ;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this. salary = salary;
	}
	

	
}
