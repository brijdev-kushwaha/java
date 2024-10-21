package Inheritance;

public class ArrayOperation {
     public int[] numbers;
     
     public ArrayOperation(int[] numbers) {
    	 this.numbers = numbers;
     }
	
	public class Statistic{
		
		double mean() {
			double sum = 0;
			for(int i = 1; i < numbers.length; i++) {
				sum += i;
			}
			
			return sum / numbers.length;
		}
		double median() {
			return 0;
		}
		
	}



}
