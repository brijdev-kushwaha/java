package PassBy;

public class PassByvalue {
	public static void main(String [] args) {
		int x = 10;
		int y = 23;
		int sum = add(x, y);
		System.out.println(x + " " + y);
		System.out.print(sum);
		
	}
	public static int add(int a, int b) {
		return a += b;
	}

}
