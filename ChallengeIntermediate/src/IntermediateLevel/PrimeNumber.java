package IntermediateLevel;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		boolean isPrime = isPrime(num);
		if (isPrime) {
			System.out.print("Number is prime: ");
			
		}else {
			System.out.print("Number is not prime because it can be  divide : ");
		}
		

	}
	public static boolean isPrime(int num) {
		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				
				return false;
			}
		    i++;
		}
		return true;
	}

}
