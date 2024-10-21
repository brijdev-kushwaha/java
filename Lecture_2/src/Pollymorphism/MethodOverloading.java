package Pollymorphism;

public class MethodOverloading {
	
	public int sum(int a , int b, int c ) {
		int sum;
		return sum = a + b + c;
	}
	public int sum(int a , int b) {
		int sum;
		return sum = a + b;
	}
	public double sum (double a ,  double b) {
		double sum;
		return sum = a + b;
		
	}
	public static void main(String [] arg) {
		MethodOverloading over = new MethodOverloading();
		//int sum = over.sum(5, 7);
		// sum = over.sum(3,5,5);
		 double sum = over.sum(4.6, 4.3);
		System.out.println(sum);
	}

}
