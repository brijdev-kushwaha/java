package IntermediateLevel;

public class Sum_avg2DArray {
	public static void main(String [] args) {
		System.out.println("Welcome to Sum and Average of 2d Arrays");
		int[][] numArr = ArrayUtility.input2DArray();
		long sum = sum(numArr);
		double avg = average(numArr);
		System.out.println("Sum of the Array is : "+ sum);
		System.out.print("The average of number is : "+ avg);
	}
	public static double average(int[][] numArr ) {
		
		if(numArr.length == 0) {
			return 0;
		}
		int row = numArr.length;
		int colms = numArr[0].length;
		double size = row * colms;
		return sum(numArr) / size;
		
	}
	public static long sum(int[][] numArr) {
		int sum = 0;
		int i = 0;
		while (i < numArr.length) {
			int j = 0;
			while (j < numArr[i].length) {
				sum += numArr[i][j];
			    j++;
			}
			i++;
		}
		return sum;
	}

}
