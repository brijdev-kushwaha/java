package oops;

import java.util.Scanner;

public class isPrimeOrNot {
 public static void main(String [] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Please Enter your number: ");
	 int num =  input.nextInt();
	 System.out.print("Your number is : " + (isPrime(num)? "Prime" : "Not Prime"));
	 
 }
 public static boolean isPrime(int num) {
	 for(int i = 2; i < num; i++) {
		 if(num % i == 0) {
			 return false;
		 }
	 }
	 return true;
 }
}
