import java.util.Calendar;

import utils.Period;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar startDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		startDate.set(2013, 11, 25);
		endDate.set(2013, 12, 25);
		Period p = new Period(startDate, endDate);
		
		System.out.println("" + p.toString());
		System.out.println("" + p.toString());
		System.out.println("" + p.getDaysNumberBetween());
	}

}
