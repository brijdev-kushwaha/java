package oops;

import java.util.Scanner;

public class evenOroddTernory{
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		String result = (num % 2 == 0) ? "Even Number" : "Odd Number";
		System.out.println("Your Entered : " + result);
	}
}