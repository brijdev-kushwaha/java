package oops;

import java.util.Scanner;

public class calculatorSwitch {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the  number1 : ");
		int num1 = input.nextInt();
		System.out.print("Enter the  Operation + , - , * , / ,% : ");
		String operation = input.next();
		System.out.print("Enter the  number2 : ");
		int num2 = input.nextInt();
		
	    int result = switch(operation) {
	    case "+" -> num1 + num2;
	    case "-" -> num1 - num2;
	    case "*" -> num1 * num2;
	    case "/" -> num1 / num2;
	    case "%" -> num1 % num2;
	    default -> 0;
	    };
	    System.out.print("Your result: " + result);
				
	}

}