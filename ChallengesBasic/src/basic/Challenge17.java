package basic;

import java.util.Scanner;

public class Challenge17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Now,Please Enter the second number: ");
		int b = sc.nextInt();
		System.out.print("Enter the last number: ");
		int c = sc.nextInt();
		
		if(a > b && b > c) {
			System.out.print("A is Greatest number: "+ a);
		}else if(b > c) {
			System.out.print("B is greatest number: "+ b);
			
		}else {
			System.out.println("C is greatest number: " + c);
		}

	}

}
