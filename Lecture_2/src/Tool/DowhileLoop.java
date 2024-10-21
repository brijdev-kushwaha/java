package Tool;

import java.util.Scanner;

public class DowhileLoop {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Please Enter the number: ");
		int num = input.nextInt();
		//int num = 4;
		int i = 0;
		do {
			System.out.print( num * i + " ");
			i++;
		}while(i <= 10);
	}

}
