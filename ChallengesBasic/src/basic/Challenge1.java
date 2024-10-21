//Create a program that takes two numbers and show result of all arithmetic operators...

package basic;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Number A: ");
		int A = sc.nextInt();
		System.out.println("Enter your Second Number B: ");
		int B = sc.nextInt();
		
		System.out.println("Add: "+ (A+B));
		System.out.println("Add: "+ (A-B));
		System.out.println("Add: "+ (A*B));
		System.out.println("Add: "+ (A/B));
		System.out.println("Add: "+ (A%B));
		

	}

}
