package Enums;

public class TestWeek {
	public static void main(String [] args) {
//		Week Day = Week.FRIDAY;
//		System.out.println(Week.MONDAY);
//		System.out.println(Week.TUESDAY);
//		System.out.println(Week.WEDNESDAY);
//		System.out.println(Week.THRUSDAY);
//		System.out.println(Week.FRIDAY);
//		System.out.println(Week.SUTRDAY);
//		System.out.println(Week.SUNDAY);
		
//		for(Week day : Week.values()) {
//			System.out.println("Days of Week: " + day);
//		}
//	}
		System.out.println("Type of Week...");
		
		for(Day day : Day.values()) {
			
			System.out.printf("Days of Weeks %s : %s:\n " , day , day.getType());
		}

}
}