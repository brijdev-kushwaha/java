package com.Task_1_L1;


	import java.util.Scanner;

	public class TemperatureConverter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter temperature:");
	        double temperature = scanner.nextDouble();
	        
	        System.out.println("Convert to (1) Celsius or (2) Fahrenheit?");
	        int choice = scanner.nextInt();
	        
	        if (choice == 1) {
	            double celsius = (temperature - 32) * 5 / 9;
	            System.out.println("Temperature in Celsius: " + celsius);
	        } else if (choice == 2) {
	            double fahrenheit = (temperature * 9 / 5) + 32;
	            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
	        } else {
	            System.out.println("Invalid choice.");
	        }
	        
	        scanner.close();
	    }
	}
	
	//OutPut:
	
	/*Enter temperature:
	26
	Convert to (1) Celsius or (2) Fahrenheit?
	2
	Temperature in Fahrenheit: 78.8 */



