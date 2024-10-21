package basic;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Please Enter your Age: ");
	   int age = sc.nextInt();
	   System.out.println("Please Enter your Gendar (True/ false): ");
	   boolean isFemale = sc.nextBoolean();
	   
	   
	   if(age < 5) {
		   System.out.println("You got 75% discount:");
		   
	   	}else if(isFemale) {
	   		System.out.println("You got 50% discount:");
	   		
	   	}else if (age < 60 && !isFemale)
	   	{
	   		System.out.println("You got 25% discount:");
	   	}
	   	else {
	   		System.out.println("You are not eligible for discount");
	   	}

	}

}
