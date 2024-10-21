package oops;

import java.util.Scanner;

public class passwordchecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password;
		do {
			System.out.print("Please Enter the password: ");
			password = input.next();
		}while(!isPassword(password));
         System.out.print("Thanks for Entering a valid password");
	}
	public static boolean isPassword(String password) {
		return password.length() > 6;
	}

}
