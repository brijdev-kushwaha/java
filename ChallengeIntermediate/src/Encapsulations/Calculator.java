package Encapsulations;

import com.kgcoding.Circle;
import com.kgcoding.Rectangle;

public class Calculator {
	public static void main(String[] args) {
		Circle circle = new Circle (5.5);
		Rectangle rect = new Rectangle (5, 9);
		double cirArea = Math.PI * Math.pow(circle.radius, 2);
		double rectangle = rect.breath * rect.length;
		//System.out.println("The Area of the Rectangle is : " + rectangle);
		//System.out.print("The Area of the circle of : " + cirArea);
		System.out.printf("the area of circle is : %f , the area of Rectangle is : %f: ", cirArea , rectangle );
	}

}


