package IntermediateLevel;

import java.util.Scanner;

public class LoopPatterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of rows: ");
		int rows = sc.nextInt();
		rightHalfPyramid(rows);
		reverseRightHalfPyramid(rows);
		leftHalf(rows);
	}
	public static void leftHalf(int maxRows) {
		System.out.println("Here is the left half pyramid");
		int rows = maxRows;
		while(rows > 0) {
			//this loop is print space 
			int j = 0;
			while (j < rows-1) {
				System.out.print("  ");
				j++;
			}
			//this loop is print Star
			int i = 0;
			while(i <= (maxRows-rows)) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
	}
	public static void reverseRightHalfPyramid(int maxRows) {
		System.out.println("\nLeft Half Pyramid ");
		int rows = maxRows;
		while ( rows > 0) {
	        int i = 0;
			while(i < rows) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
	}
	public static void rightHalfPyramid(int maxRows) {
		System.out.println("\nRight Half Pyramid ");
		int rows = 0;
	
		while (rows < maxRows) {
			System.out.print("*");
		
			 int i = 0;
		     while (i < rows) {
		    	 System.out.print(" *");
		    	 i++;
		     }
		     System.out.println();
		     rows++;
		}
	
		}

}

