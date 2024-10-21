//Create a program to Right shift the bit of given number....
package basic;

import java.util.Scanner;

public class Challege22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		int result = number << 2; // Right shift
		int result1 = number >> 1; // Left shift
		System.out.println(result1);
		System.out.print(result);

	}

}
