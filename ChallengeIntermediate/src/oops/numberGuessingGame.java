package oops;

import java.util.Scanner;

public class numberGuessingGame {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int myNumber = (int)(Math.random()*100);
		int userNumber = 0;
		
		do {
			System.out.println("Guess the number: ");
			userNumber = input.nextInt();
			
			if(userNumber == myNumber) {
				System.out.println("wooooho ....CORRECT NUMBER ....");
			    break;
			}else if(userNumber > myNumber) {
				System.out.println("Your number is too large: ");
			}else {
				System.out.println("Your number is too small: ");
			}
			
		}while(userNumber >= 0);
	}

}
