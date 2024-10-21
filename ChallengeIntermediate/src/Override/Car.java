package Override;

public class Car extends Vehicle {
	
	public void Service() {
		super.Service();
		System.out.println("What you want to repaire Please tell me....");
	}
	
	public static void main(String [] args) {
		Vehicle ven = new Car();
		ven.Service();
	}
	 

}
