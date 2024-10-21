package abstraction;

public class Circle extends Shape {
	
	Circle(double radius){
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		System.out.println("Circle: " + Math.PI * Math.pow(radius,2));
		
	}
	
	

}
