package IntermediateLevel;

import java.util.Scanner;

public class ArrayUtility {
	public static int[] inputArray() {
		
	Scanner input = new Scanner(System.in);
	System.out.print("Please Enter the number of element : ");
	int size = input.nextInt();
	int[] nums = new int[size];
    // displayArray(nums);

	
	int i = 0;
	while(i < size) {
		System.out.print("Please Enter the element:"+ (i+1) + ": ");
		nums[i] = input.nextInt();
		i++;
	}
	return nums;
 }
	public static void displayArray(int[] numArr) {
		int i = 0;
		 while (i < numArr.length) {
			 System.out.print(numArr[i] + " ");
			 i++;
		 }
		System.out.println();
	}
	public static int[][] input2DArray() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the number of rows : ");
		int rows = input.nextInt();
		System.out.print("Please Enter the number of columns: ");
		int columns = input.nextInt();
		int[][] numArray = new int[rows][columns];
	  
		int i = 0;
		while(i < rows) {
			int j = 0;
			while (j < columns) {
				System.out.print("Please Enter the no of row:"+ (i+1) +","+ "colums :"+ (j+1) + " ");
				numArray[i][j] = input.nextInt();
				j++;
			}
			i++;
		}
		return numArray;
		
		
			
		}
		

}
