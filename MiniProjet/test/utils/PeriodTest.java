package utils;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class PeriodTest {

	@Test
	public void getDaysNumberBetween() {
		Calendar startDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		
		startDate.set(2013, 11, 25);
		endDate.set(2013, 12, 25);
		Period p1 = new Period(startDate, endDate);
		
		assertEquals(31, p1.getDaysNumberBetween());
		
		startDate.set(2013, 12, 1);
		endDate.set(2013, 12, 1);
		Period p2 = new Period(startDate, endDate);
		
		assertEquals(0, p2.getDaysNumberBetween());
		
		startDate.set(2013, 11, 2);
		endDate.set(2013, 11, 4);
		Period p3 = new Period(startDate, endDate);
		
		assertEquals(2, p3.getDaysNumberBetween());
		
		// if the endDate is before the startDate, 
		// it considerate that the periode is in the startDate and the startDate
		startDate.set(2013, 12, 10);
		endDate.set(2013, 12, 4);
		Period p4 = new Period(startDate, endDate);
		
		assertEquals(0, p4.getDaysNumberBetween());
	    
	}
	
	

}
