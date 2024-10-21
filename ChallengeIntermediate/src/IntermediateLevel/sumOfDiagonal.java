package IntermediateLevel;

import java.util.Scanner;

public class sumOfDiagonal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] numArr = ArrayUtility.input2DArray();
		long sum = sumOfDiagonal(numArr);
		System.out.println("Here is the sum of Diagonal:" + sum);
		

	}
	public static long sumOfDiagonal (int[][] numArr) {
		long leftSum = sumOfRightDiagonal(numArr);
		long rightSum = sumOfLeftDiagonal(numArr);
		long sum = leftSum + rightSum;
		if(numArr.length % 2 != 0) {
			int ind = numArr.length / 2;
		
			sum -= numArr[ind][ind];
			
		}
		return sum;
	}
    public static int sumOfLeftDiagonal(int[][] numArr) {
    	int sum = 0;
    	int i = 0;
    	while (i < numArr.length) {
    		sum+=numArr[i][i];
    		i++;
    	}
    
    	return sum;
    }
    public static int sumOfRightDiagonal(int[][] numArr) {
    	int sum = 0;
    	int i = 0;
    	while ( i < numArr.length) {
    		int col = numArr.length - 1 -i;
    		sum  += numArr[i][col];
    		i++;
    	}
    
    	return sum;
}
}
