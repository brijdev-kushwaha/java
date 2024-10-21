package IntermediateLevel;

import java.util.Scanner;

public class noOfOccurrence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = ArrayUtility.inputArray();
		System.out.print("Enter the number you want to find: ");
		int num = sc.nextInt();
		int occ = noOfOccurrence(nums, num);
		System.out.print("the nomber is occurrences: "+ occ);
	}

	public static int noOfOccurrence(int[] nums, int num) {
		int occ = 0;
		int i = 0;
		while(i < nums.length) {
			if( nums[i] == num) {
				occ++;
			}
			i++;
		}
		return occ;
	}
}


