//Develop the program to print the multiplication table for given number...

package IntermediateLevel;
import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the number: ");
		int n = sc.nextInt();
		
		
		int i = 1;
		while(i <= 10) {
			System.out.println(n +" X "+ i +" = "+(n*i));
			i=i+1;
			
		
		}
		
		
	
		

	}

}
