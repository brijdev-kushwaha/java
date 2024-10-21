package Encapsulations;

public class TestEmployee {
	public static void main(String[] args) {
	Employee emp = new Employee("Brijdev ", " 21", " 340000");
	System.out.println(emp.EmployeeDetails());
	emp.setAge("20");
	emp.getAge();
	emp.setName("Vikash");
	emp.getName();
	emp.setSalary("50000");
	emp.getSalary();
	System.out.println(emp.EmployeeDetails());

}
}
