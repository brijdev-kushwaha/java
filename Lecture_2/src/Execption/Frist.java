package Execption;

import java.util.Scanner;

public class Frist {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		try {
			int result = num1 / num2;
			
			System.out.print(result);
		}
		catch(Exception exception) {
			System.out.print("Invailid division..."+ exception.getMessage());
		}
		finally {
			System.out.print("  I'm in finally block");
			
		}
	}
}
