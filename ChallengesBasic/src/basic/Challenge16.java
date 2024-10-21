//Create a program to check the number is number is odd or even

package basic;

import java.util.Scanner;

public class Challenge16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Frist number : ");
		int a = sc.nextInt();
		
		
		
		if(a % 2 == 0) {
			System.out.print("Even Number: "+ a);
		}else {
			System.out.println("Odd Number: " + a );

		}

	}

}
