//Create a Program to find the simple interest........

package basic;

import java.util.Scanner;

public class Challenge5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount: ");
		float P = sc.nextFloat();
		System.out.println("Enter the Time: ");
		int T = sc.nextInt();
		System.out.println("Enter the Rate: ");
		float R = sc.nextFloat();
		
		float simpleIntrest = (P*T*R)/100;
		
		System.out.println("Intrest: "+simpleIntrest);

	}

}
