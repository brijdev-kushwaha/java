package oops;

import IntermediateLevel.ArrayUtility;
import java.util.*;

public class maxArray {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = ArrayUtility.inputArray();
		int max = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(max < num ) {
				max = num;
			}
		}
		System.out.print("Here is the maximum number is: " + max);
	}

}
