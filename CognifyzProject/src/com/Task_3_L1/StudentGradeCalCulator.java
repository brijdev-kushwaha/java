package com.Task_3_L1;

import java.util.Scanner;

public class StudentGradeCalCulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the obtain the number in the subjects: ");
		System.out.print("Hindi: ");
		int Hindi = sc.nextInt();
		System.out.print("English: ");
		int English = sc.nextInt();
		System.out.print("Physics: ");
		int Physics = sc.nextInt();
		System.out.print("Chemistry: ");
		int Chemistry = sc.nextInt();
		System.out.print("Math: ");
		int Math = sc.nextInt();
		
		int marks = (Hindi + English + Physics + Chemistry + Math);
		System.out.println("Total marks is: " + marks);
		
		double percentage = marks / (double)500*100;
		System.out.println("Percentage: " + percentage+ "%");
		
		if(percentage > 90) {
			System.out.println("Grade A ");
			
		}else if (percentage > 75) {
			System.out.println("Grade B");
		}else if (percentage > 60) {
			System.out.println("Grade C");
			
		}else if(percentage > 30) {
			System.out.println("Pass");
		}else {
			System.out.print("Fail");
		}
		
	}

}

//OutPut:

/* Please Enter the obtain the number in the subjects: 
Hindi: 56
English: 76
Physics: 86
Chemistry: 87
Math: 98
Total marks is: 403
Percentage: 80.60000000000001%
Grade B */
