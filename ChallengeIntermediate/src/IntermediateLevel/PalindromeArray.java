package IntermediateLevel;

public class PalindromeArray {

	public static void main(String[] args) {
		System.out.println("Welcome to palindrome Checker\n");
		int[] numArr = ArrayUtility.inputArray();
		boolean ispalindrome = isPalindrome(numArr);
		if(ispalindrome) {
			System.out.println("Your Array is Palindrome: ");
			
		}else {
			System.out.print("Your Array is not Palindrome: ");
		}
		
	}
	public static boolean isPalindrome(int [] numArr) {
		int i = 0;
		while (i < numArr.length / 2) {	
			if(numArr[i] != numArr.length -1-i ) {
				return false;
			}
			i++;
		}
		return true;
	}

}
