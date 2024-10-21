package Tool;

import java.util.Scanner;

public class recursion {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the number: ");
		int num = input.nextInt();
		long fact = factorial(num);
		System.out.print("Factorial of your number is : "+ fact);
		
	}
	public static long factorial(int num) {
		System.out.println("Method called for: "+ num);
		if(num == 1) {
		return 1;
	}
	return num *  factorial(num - 1);

}
}