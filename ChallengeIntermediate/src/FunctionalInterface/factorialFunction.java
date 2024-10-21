package FunctionalInterface;

import java.util.stream.IntStream;

public class factorialFunction {
	public static void main(String[] args) {
		System.out.println("Factorial using two way...");
		int num = 5;
		System.out.println("Factorial using normal function: \n" + factorial(num));
		System.out.println("Factorial using Functional method");
		
		IntStream.rangeClosed(2, num)
					.reduce((a,b) -> a * b)
					 .ifPresent(System.out::println);
		
		
	}
	public static int factorial(int num) {
		int fact = 1;
		if(num == 0 | num == 1) {
			return 1;
		}
		for(int i = 2; i <= num; i++) {
			fact *= i;
		}
		return fact;
		
	}

}
