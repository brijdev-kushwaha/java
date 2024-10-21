package oops;

import java.util.Scanner;

public class circle {
	
	double radiusInMm;
	
	circle(double circleInMm){
		this.radiusInMm = circleInMm;
	}
	public double getCircomference() {
		return 2 * radiusInMm * Math.PI;
	}
	public double getArea() {
		return Math.PI * Math.pow( radiusInMm, 2);
	}
	public String toString() {
		return "Circle Properties: radiusInMm:" + radiusInMm + " Circumferemce:" 
	            + getCircomference() + ","
				+ ", Area: " + getArea();
	}
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the radius: ");
		double radius = input.nextDouble();
		circle cs = new circle(radius);
		
		System.out.print(cs);
	}

}

