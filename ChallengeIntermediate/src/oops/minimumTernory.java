package oops;

import java.util.Scanner;

public class minimumTernory {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1 = input.nextInt();
		System.out.print("Now, Enter the second number:");
		int num2 = input.nextInt();
		int result = num1 < num2 ? num1 : num2;
		System.out.print("The mininum number is : " + result);

	}

}
