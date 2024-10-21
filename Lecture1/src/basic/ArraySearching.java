package basic;

import java.util.Scanner;

public class ArraySearching {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr[] = {45, 46, 32 ,77, 86, 34,88 ,98,33};
		System.out.println("welcome to Array Searching \n");
		System.out.println("Please Enter the number: ");
		int num = sc.nextInt();
		boolean isFound = isFound(arr, num);
		if(isFound)
		{
			System.out.print("Your number is Found ");
		}else {
			System.out.println("Your number is not found");
		}
		
		

	}
	public static boolean isFound(int [] arr, int num) {
		int index = 0;
		while(index < arr.length) {
			if(arr[index] == num) {
				return true;
			}
			index++;
		}
		return false;
	}

}
