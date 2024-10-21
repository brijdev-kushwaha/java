package TrafficLight;

public class Road {

	public static void main(String[] args) throws InterruptedException {
		TrafficLightThread red = new TrafficLightThread(TrafficLight.RED);
		TrafficLightThread yellow = new TrafficLightThread(TrafficLight.YELLOW);
		TrafficLightThread green = new TrafficLightThread(TrafficLight.GREEN);
		
		red.start();
		System.out.println("Please Wait Signal is RED...");
		red.join();
		yellow.start();
		System.out.println("Ready to go ....");
		yellow.join();
		green.start();
		System.out.println("Go........");
		

	}

}
