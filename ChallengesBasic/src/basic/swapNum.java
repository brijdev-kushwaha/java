package basic;

import java.util.Scanner;

public class swapNum {

	public static void main(String[] args) {
		System.out.println("Welcome to Swapping Station");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number A: ");
        int A = sc.nextInt();
        System.out.print("Enter Number B: ");
        int B = sc.nextInt();
        
        int c = A;
            A = B;
            B = c;
            
        System.out.println("Swapping done.....");
        System.out.println("A: " + A);
        System.out.println("B: "+ B);
	}

}
