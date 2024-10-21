package oops;

import java.util.Scanner;

public class absoluteTernory {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		int result = num >= 0 ? num : -num;
		System.out.print("Your absolute value is : " + result);
	}

}
