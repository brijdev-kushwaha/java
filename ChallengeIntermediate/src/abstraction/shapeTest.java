package abstraction;

public class shapeTest {
	public static void main(String [] args) {
	//Shape s = new Shape();   we can't create a object for abstract class
		Circle gola = new Circle(5);
		gola.calculateArea();
		Square square = new Square(4,2,2);
		square.calculateArea();

}
}