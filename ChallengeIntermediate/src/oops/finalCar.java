package oops;

public class finalCar {
	final String name;
	final String modal;
	final int noOfWhiles;
	
	public finalCar(String name, String modal, int noOfWhile) {
		this.modal = modal;
		this.name = name;
		this.noOfWhiles = noOfWhile;
	}
	public static void main (String[] args) {
		finalCar car = new finalCar("TOYOTA","2023" , 4);
		System.out.print(car.toString());
	}

}
