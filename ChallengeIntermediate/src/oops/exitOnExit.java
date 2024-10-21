
package oops;

import java.util.Scanner;

public class exitOnExit {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Please enter the command: ");
			String str = input.next();
			if(str.equalsIgnoreCase("exit")) {
				break;
			}
		
		}
		System.out.println("You are succesfully Exited");
	}

}
