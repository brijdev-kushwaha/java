package Enums;

public enum Day {
	MONDAY(true),
	TUESDAY(true),
	WEDNESDAY(true),
	THRUSDAY(true),
	FRIDAY(true),
	SUTRDAY(false),
	SUNDAY(false);

	private final boolean isWeekDay;
	
	
	Day(boolean isWeekDay){
		this.isWeekDay = isWeekDay;
	}
	public  String getType() {
		return isWeekDay ? "WeekDay" : "Weekend";
	}

}
