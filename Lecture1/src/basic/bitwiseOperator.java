package basic;

public class bitwiseOperator {

	public static void main(String[] args) {
		
		
		int a = 13;
		int n = 11;
		
		int c = a & n; // bitwise & operator
		int d = a | n; // bitwise Or | operator
		int e = a ^ n; // bitwise XOR operator
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(c);
		
		int f = ~a;   // Compliment
		System.out.println(f);

	}

}
