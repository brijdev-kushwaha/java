//Create a program check the number is even or odd using any bitwise operator...

package basic;

import java.util.Scanner;

public class Challege21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        
        if((number & 1) == 0) {
        	System.out.println("The number is even");
        }else {
        	System.out.print("The number is Odd");
        }
	}

}
