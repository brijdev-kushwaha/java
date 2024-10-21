package com.Task_2_L1;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		boolean isPalindrome = isPalindrome(num);
		if(isPalindrome) {
			System.out.print("Your number is palindrome: ");
			
		}else {
			System.out.println("Your number is not Palindrome: ");
		}
		

	}
	public static boolean isPalindrome(int num) {
		return num == reverse(num);
	}
	
	public static int reverse(int num) {
		int newNum = 0;
		while (num > 0) {
			int digit = num % 10;
			newNum = newNum * 10 + digit;
			num /= 10;
		}
		return newNum;
	}

}

//OutPut:

/*Enter the number: 12321
Your number is palindrome: */
