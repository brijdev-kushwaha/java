package abstraction;

public class Square extends Shape {
	
	Square(double breath, double length , double radius){
		this.breath = breath;
		this.length = length;
		this.radius = radius;
	}
	
	public void calculateArea() {
		System.out.print("Square: " + length * breath * radius);
	}

}
