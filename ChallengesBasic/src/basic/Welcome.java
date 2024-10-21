package basic;
import java.util.Scanner;

public class Welcome {
	
	public static void main(String[]args) {
		System.out.println("Please Enter your Name: ");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		System.out.println("Welcome to Java World "+ s);
		
	}

}
