package utils;

import java.util.Calendar;

public class Period {
	private Calendar startDate;
	private Calendar endDate;
	
	public Period(Calendar sd, Calendar ed) {
	    super();
	    this.startDate = sd;
	    this.endDate = ed;
    }
	
	public Calendar getStartDate() {
    	return startDate;
    }
	
	public Calendar getEndDate() {
    	return endDate;
    }

	// TODO à vérifier
	public int getDuration() {
		return this.startDate.compareTo(this.endDate);
	}
}
