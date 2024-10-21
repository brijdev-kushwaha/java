//Calculate the Grade of the Student.....

package basic;

import java.util.Scanner;

public class Challenge19 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Subjects number of the Student: ");
		int Hindi = sc.nextInt();
		int English = sc.nextInt();
		int Physics = sc.nextInt();
		int Chemistry = sc.nextInt();
		int Math = sc.nextInt();
		
		int marks = (Hindi + English + Physics + Chemistry + Math);
		System.out.println("Total marks: "+marks);
		
		double Parcentage = marks/(double)500*100;
		
		System.out.println("Parcentage: "+Parcentage);
		
		if(Parcentage > 90 ) {
			System.out.print("very good Ranked 'A'");
		}else if(Parcentage > 75) {
			System.out.print("good Ranked 'B'");
		}else if(Parcentage > 60) {
			System.out.print("Ranked 'C' ");
		}else if(Parcentage > 30) {
			System.out.println("You need to focus on the study: Pass");
			
		}else
			System.out.print("You need focus & work hard : fail...");
		
	}

}
