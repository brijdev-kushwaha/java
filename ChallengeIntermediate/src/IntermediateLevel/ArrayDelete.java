package IntermediateLevel;

import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Array Deletion");
		int[] numArr = ArrayUtility.inputArray();
		System.out.print("Enter the element which want to delete: ");
		int numToDelete = input.nextInt();
		int[] newArr = deleteNumber(numArr , numToDelete);
		System.out.println("Here is the new Array");
		ArrayUtility.displayArray(newArr);
		
		

	}
	public static int[] deleteNumber(int[] numArr , int numToDelete) {
		int occ = noOfOccurrence.noOfOccurrence(numArr , numToDelete);
		if(occ == 0) {
			return numArr;
		
		}
		int newSize = (numArr.length - occ);
		
		int[] newArray = new int[newSize];
		
		
		int i = 0, j = 0;
		 
		while(i < numArr.length) {
			if(numArr[i] != numToDelete) {
			   newArray[j] = numArr[i];
				j++;
			}
			i++;
		}
		
		return newArray;
	}

}

