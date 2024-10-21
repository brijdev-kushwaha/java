package IntermediateLevel;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		int[] numArray = ArrayUtility.inputArray();
		long sum = sum(numArray);
		double avg = Average(numArray);
		System.out.println("\nThe sum of Array is :" +sum);
		System.out.print("The Average of Array is : " + avg);
		
		
	}
	public static long sum(int[] numArray) {
		int sum = 0;
		int i = 0;
		while(i < numArray.length) {
		  sum += numArray[i];
		  i++;
		}
		
		return sum;
	}
	public static double Average(int[] numArray) {
		double sum = sum(numArray);
		
		
		return (sum / numArray.length);
	}
}
