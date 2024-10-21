package LambdaAndStream;

import java.util.List;

public class reduceMethod {
	public static void main(String[] args) {
		List<Integer> number = List.of(1,2,3,5,6,8,6,3);
		int sum = 0;
		for(int n : number) {
			sum += n;
		}
		System.out.println(sum);
		
		int newSum = number.stream().reduce(0,(a,b) -> a + b);  // reduce method..
		
		System.out.println("Sum using function: " + newSum);
		
		int  max = number.stream().reduce(Integer.MIN_VALUE,(a,b) -> a > b ? a : b);
		System.out.println("maximum value in the list: " + max);
		
		int min = number.stream().reduce(Integer.MAX_VALUE,(a,b) -> a < b ? a : b);
		System.out.println("Minimum value in the list: " + min);
		
	}
      
}


