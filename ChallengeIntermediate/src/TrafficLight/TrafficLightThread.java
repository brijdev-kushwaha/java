package TrafficLight;

public class TrafficLightThread extends Thread {
	
	private final TrafficLight color;
	
	public TrafficLightThread(TrafficLight color){
		this.color = color;
	}
	
	public void run() {
		System.out.printf("\n %s Signal active ", color);
		try {
			Thread.sleep(color.onTimeMilis);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.printf("\n %s Signal Inactive --> ", color);
		
	}

}
