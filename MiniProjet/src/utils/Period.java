package utils;

import java.util.Calendar;

public class Period {
    
    // Fields
    
    private Calendar startDate;
    private Calendar endDate;

    // Constructors
    
    public Period() {
        this(Calendar.getInstance(), Calendar.getInstance());
    }
    
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

    // TODO to verify
    public int getDuration() {
        return this.startDate.compareTo(this.endDate);
    }
    
    public String toString() {
        return "from "+startDate.get(Calendar.DATE)+"/"+startDate.get(Calendar.MONTH)
                +"/"+startDate.get(Calendar.YEAR)+" to "+endDate.get(Calendar.DATE)
                +"/"+endDate.get(Calendar.MONTH)+"/"+endDate.get(Calendar.YEAR);
    }
}
