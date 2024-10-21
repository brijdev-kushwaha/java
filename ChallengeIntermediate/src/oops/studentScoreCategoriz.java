package oops;

import java.util.Scanner;

public class studentScoreCategoriz {
	public static void main(String []args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Please Enter the marks: ");
	 int marks = input.nextInt();
	 String result = marks > 90 ? "High" : (marks > 50 ? "Moderate" : "Low");
	 System.out.print("Your Student is "+ result + " Level Categori");
	}

}
