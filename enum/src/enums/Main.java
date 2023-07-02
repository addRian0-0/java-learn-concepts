package enums;

public class Main {

	public static void main(String[] args) {
		System.out.println("Run main for test enums...");
		for(Day day: Day.values()) {
			System.out.println("Day of the week is: " + day);
		}
		
		Day friday = Day.FRIDAY;
		System.out.println(friday.name()); // FRIDAY -> when processing data 
		System.out.println(friday.ordinal()); // 6
		System.out.println(friday.toString()); // "FRIDAY" -> for seen and processing data
		
	}
	
}
