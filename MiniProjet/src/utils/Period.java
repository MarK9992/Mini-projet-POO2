package utils;
import java.util.Calendar;

public class Period {
    
    // Fields 
	
    private Calendar startDate;
    private Calendar endDate;

    // Constructors
    
    public Period() {
        this(Calendar.getInstance(), Calendar.getInstance());
        long endTime = this.startDate.getTimeInMillis() + (24 * 60 * 60 * 1000)*7 ;
        this.endDate.setTimeInMillis(endTime);
    }
    
    public Period(Calendar sd, Calendar ed) {
        super();
        this.startDate = sd;
        this.endDate = ed;
        
        // Verify if the endDate is after the startDate, 
        // else correct it in considering that the period is between the startDay and itself
        if(this.getDaysNumberBetween()<0) {
        	this.endDate = this.startDate;
        }
    }
	
    public Calendar getStartDate() {
        return startDate;
    }
	
    public Calendar getEndDate() {
    	return endDate;
    }

    public long getDaysNumberBetween() {
    	long time = this.endDate.getTimeInMillis()-this.startDate.getTimeInMillis();
    	return time / (24 * 60 * 60 * 1000);
    }
    
    /**
     * Returns true if today is in the period.
     * @return
     */
    public boolean today() {
        long today = Calendar.getInstance().getTimeInMillis();
        return today > startDate.getTimeInMillis() && today < endDate.getTimeInMillis();
    }
    
    public String toString() {
        return "from "+startDate.get(Calendar.DATE)+"/"+startDate.get(Calendar.MONTH)
                +"/"+startDate.get(Calendar.YEAR)+" to "+endDate.get(Calendar.DATE)
                +"/"+endDate.get(Calendar.MONTH)+"/"+endDate.get(Calendar.YEAR);
    }
}
