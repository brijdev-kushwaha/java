package basic;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = sc.nextInt();
		
		while(10 >= number) {
		
			System.out.println(number);
			number++;
		}

	}

}
