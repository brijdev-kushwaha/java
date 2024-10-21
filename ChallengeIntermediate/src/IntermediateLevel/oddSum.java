package IntermediateLevel;
import java.util.Scanner;

//Create a program to sum of all odd number to 1 to n number...

public class oddSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number: ");
		int num = sc.nextInt();
		int sum = oddSum(num);
		
		System.out.println("OddSum til "+ num + " is :" + sum);

	}
	public static int oddSum(int num) {
		int i = 1;
		int sum = 0;
		 while (i <= num) {
			 sum += i;
			 i += 2;
			
		 }
		return sum;
	}

}
