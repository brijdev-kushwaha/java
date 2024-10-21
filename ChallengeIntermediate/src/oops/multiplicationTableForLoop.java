package oops;

import java.util.Scanner;

public class multiplicationTableForLoop {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the number : ");
		int num = input.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
			
		}
	}

}
