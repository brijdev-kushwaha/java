package IntermediateLevel;

import java.util.Scanner;

public class SomefDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number: ");
		int num = sc.nextInt();
		int someofDigits = someofDigits(num);
		System.out.println("Some of Digits: " + someofDigits);
		

	}
	public static int someofDigits(int num) {
		int sum = 0;
		while (num > 0) {
			 sum += num % 10;
			 num /=10;
			
		}
		return sum;
	}

}
