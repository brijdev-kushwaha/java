package IntermediateLevel;

import java.util.Scanner;

public class factorial {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number: ");
		int num = sc.nextInt();
		long fact = factorial(num);
		System.out.println("The factorial is : "+ fact);
		
	}
	public static int factorial(int num){
		if(num < 2) {
			return 1;
		}
		int i = 2;
		int fact = 1;
		while(i <= num) {
			fact *= i;
			i++;
			
		}
		return fact;
	}

}
