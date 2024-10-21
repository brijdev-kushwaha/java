package TrafficLight;

public enum TrafficLight {
	RED(9000),
	YELLOW(2000),
	GREEN(8000);
	
	public final int onTimeMilis;
	
	public int get() {
		return onTimeMilis;
	}
	
   TrafficLight(int onTimeMilis) {
	   this.onTimeMilis = onTimeMilis;
   }
  
}
