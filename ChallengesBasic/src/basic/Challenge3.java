// Create a program to calcualte Permeter of a rectangle.

package basic;
import java.util.Scanner;

public class Challenge3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Engle of rectangel: ");
		float a = sc.nextFloat();
		System.out.println("Enter the Next Engle: ");
		float b = sc.nextFloat();
		System.out.println("Enter the Next Engle: ");
		float c = sc.nextFloat();
		System.out.println("Enter the Last Engle: ");
		float d = sc.nextFloat();
		
		System.out.println("perimetere of ractangle ABCD:"+ (a+b+c+d));
		
		

	}

}
