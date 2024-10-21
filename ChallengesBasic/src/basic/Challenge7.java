//Create a Program to Convert to the fahrenheit to celsius....
package basic;

import java.util.Scanner;

public class Challenge7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperator in Fahrenheit: ");
		float F = sc.nextFloat();
		float C = (F-32)*5/9;
		
		System.out.println("Temperator in Celsius: "+ C);

	}

}
