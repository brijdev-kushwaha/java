package IntermediateLevel;

public class reverseArray {

	public static void main(String[] args) {
		int [] numArr = ArrayUtility.inputArray();
		reverse(numArr);
		System.out.print("Here is Your reverse Array is : ");
		ArrayUtility.displayArray(numArr);
		

	}
     public static void reverse(int[] arr) {
    	 int i = 0;
    	 while (i < arr.length / 2) {
    		 int swap = arr[i];
    		 arr[i] = arr[(arr.length - 1) - i];
    		 arr[(arr.length - 1) - i] = swap;
    		 
    		 i++;
    	 }
    	 
     }
}
