//Create a program that determines if a number is positive, negative , or  zero.....


package basic;

import java.util.Scanner;

public class Challenge15 {
	public static void main(String []arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		if(number > 0) {
			System.out.print("Given number is Positive number: "+ number);
			
		}else if (number == 0) {
			System.out.print("Given number is zero: "+ number);
		}
		
	 else {
		System.out.println("The number is negative: "+ number);
	}

}
}