package PassBy;

public class PassByReference {
	
	public static class Point {
		int x ;
		int y;
		
		public Point(int x , int y) {
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return "x : " + x + " y : " + y;
		}
	}
	public static void main(String [] argss) {
		Point p = new Point(3, 43);
		System.out.println(p.x);
		System.out.println(p.y);
		move(p);
	}
	public static void move (Point P) {
		P.x++;
		P.y++;
		System.out.print(P);
		
	}

}
