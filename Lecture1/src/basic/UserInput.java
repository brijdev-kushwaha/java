package basic;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("Please Enter your Good Name: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Hello " + s);
		

	}

}
