package AdvMethod;

import java.util.List;

public class TestEmployee {
  public static void main(String[] args) {
	List<Employee> employee = List.of(
			new Employee("Brijdev Kushwaha: ",65),
			new Employee("Juned Alam: ",46),
			new Employee("Musafir: ",87)
			);
	employee.stream()
			.sorted((emp1,emp2) -> Integer.compare( emp1.getsalary() , emp2.getsalary()))
			.forEach(System.out::println);
}
}
