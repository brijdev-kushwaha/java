//Create the program check the year are leap year or not.......

package basic;

import java.util.Scanner;

public class Challenge18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Year: ");
		int year = sc.nextInt();
		
		if (year % 400 == 0 && year % 100 != 0) {
			System.out.print("Leap year: "+year);
		}else if(year % 4 == 0) {
			System.out.print("Leap year");
		}
		else {
			System.out.print("Not Leap year: ");
		}
		

	}

}
