package IntermediateLevel;

public class sortedOrNot {

	public static void main(String[] args) {
		int nums[] = ArrayUtility.inputArray();
		boolean isDec = isDecerasing(nums);
		boolean isInc = isIncreasing(nums);
		 
		if(isDec || isInc) {
			System.out.print("The given Array is sorted");
		}
		else {
			System.out.print("the given Array is not sorted");
		}
 
		

	}
	public static boolean isDecerasing(int[] nums) {
		int i = 1;
		while (i < nums.length) {
			if(nums[i] > nums[i-1]) {
				return false;
			}
			i++;
		}
		
		return true;
	}
	public static boolean isIncreasing(int[] nums) {
		int i = 1;
		while (i < nums.length) {
			if(nums[i] < nums[i-1]) {
				return false;
			
			}
			i++;
		}
		return true;
	}

}
