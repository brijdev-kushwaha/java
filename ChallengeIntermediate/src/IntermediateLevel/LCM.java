package IntermediateLevel;

import java.util.Scanner;

public class LCM {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the frist number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second: ");
		int num2 = sc.nextInt();
		int LCM = LCM(num1,num2);
		System.out.println("LCM Of the number: "+ LCM);
		
		
	}
	public static int LCM(int num1, int num2) {
		int i = 1;
		while (true) {
			int factor = num1 * i;
			if(factor % num2 == 0) {
			 return factor;
		}
			i++;
	}
		
	}

}
