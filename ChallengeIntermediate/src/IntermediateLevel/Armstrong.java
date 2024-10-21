package IntermediateLevel;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the number: ");
		int num = sc.nextInt();
		boolean isArmstrong = isArmstrong(num);
		if(isArmstrong) {
			System.out.print("your number is Armstrong: ");
		}else {
			System.out.print("Your is not Armstorng: ");
		}
		

	}
	public static boolean isArmstrong(int num) {
		int noOfDigit = noOfDigit(num);
		int numCopy = num;
		int finalNumber = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			num /= 10;
			finalNumber += pow(lastDigit, noOfDigit);
		}
		return finalNumber == numCopy;
		
	}
	public static int pow(int num1, int num2) {
		int result = 1;
		int i = 0;
		while(i < num2) {
			result *= num1;
			i++;
		}
		return result;
		
	}
	public static int noOfDigit(int num) {
		int digits = 0;
		while(num > 0) {
			digits++;
			num /= 10;
		}
		return digits;
		
	}

}
