//Compound Interest Calculator.......

package basic;

import java.util.Scanner;

public class Challenge6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount: ");
		float P = sc.nextFloat();
		System.out.println("Enter the Time: ");
		int T = sc.nextInt();
		System.out.println("Enter the Rate: ");
		float R = sc.nextFloat();
		
		float CompoundInterest = P*(1+R/100)*T;
		
		System.out.println("Compound Interest: "+ CompoundInterest);
	}

}
