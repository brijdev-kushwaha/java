package Inheritance;

import Inheritance.ArrayOperation.Statistic;

public class ArrayOperationTest {
	public static void main(String [] args) {
		ArrayOperation Operation = new ArrayOperation(new int[] {2,9,87,5,4,5});
		ArrayOperation.Statistic statistic = Operation.new Statistic();
		System.out.print((statistic).mean());
	}

}

