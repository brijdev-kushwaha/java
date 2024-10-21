package MethodReferences;

import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		List<Integer> number = List.of(1,2,3,4,5,6,7,8,9,11,2,33,44);
		
		number.stream()
				.filter(num -> num % 2 == 1)
				.forEach(System.out::println);  // This is method References
				
				
				//.forEach(num -> System.out.println(num));
	}

}
