package oops;

import java.util.Scanner;

import IntermediateLevel.ArrayUtility;

public class occForEachLoop {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
    int [] nums = ArrayUtility.inputArray();
    System.out.print("Please Enter the number , you want to search: ");
    int num = input.nextInt();
    int occ = Occrences(nums,num);
    System.out.print("Occrances comes in " + occ + " times");
	}
	public static int Occrences(int [] nums, int element) {
		int occ = 0;
		for(int num : nums) {
			if(num == element) {
				occ++;
			}
		}
		return occ;
	}

}
