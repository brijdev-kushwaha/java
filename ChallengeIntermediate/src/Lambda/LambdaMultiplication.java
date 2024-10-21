package Lambda;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
	public static void main(String[] args) {
		BinaryOperator<Integer> multi = (a,b) -> a * b;
		int result = multi.apply(55, 45);
		System.out.println("Multiplication of : " + result);
	}
}
