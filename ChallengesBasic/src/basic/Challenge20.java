package basic;

import java.util.Scanner;

public class Challenge20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your age: ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.print("You are child ");
		}else if(age >= 13 && age <= 19) {
			System.out.println("Your are teenager ");
		}else if(age >= 19 && age <= 55) {
			System.out.println("You are Adalt Man");
		}else {
			System.out.println("you are a senior citizen");
		}

	}

}
