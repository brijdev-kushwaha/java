
package oops;

import IntermediateLevel.ArrayUtility;
import java.util.*;

public class addSumContinue {
	public static void main(String [] args) {
		System.out.println("Welcome to  addition of all positive number ->\n");
		Scanner input = new Scanner(System.in);
		int[] numArr = ArrayUtility.inputArray();
		
		int sum = 0 ;
		for (int num : numArr) {
			if(num < 0) {
				continue;
			}
			sum += num;
		}
		System.out.print("The sum all positive number is : " + sum);
	}

}
