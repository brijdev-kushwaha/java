package IntermediateLevel;

public class minAndmax {

	public static void main(String[] args) {
		System.out.println("welcome to max and min value search");
		int[] nums = ArrayUtility.inputArray();
		
		int max = max(nums);
		int min = min(nums);
		System.out.println("The max of the Array is : "+ max);
		System.out.print("the min value of Array is : "+ min);
		

	}
	public static int min(int[] num) {
		int min = Integer.MAX_VALUE;
		int i = 0;
		while(i < num.length) {
			if(min > num[i]);
			  min = num[i];
		i++;
		
		}
		return min;
 }
        public static int max(int[] nums) {
    	int max = Integer.MIN_VALUE;
    	int i = 1;
    	if(nums.length == 0) {
    		return Integer.MIN_VALUE;
    	}
    	while(i < nums.length) {
    		if(max < nums[i]) {
    			max = nums[i];
    		}
    		i++;
    	}
    	return max;
    }
}
