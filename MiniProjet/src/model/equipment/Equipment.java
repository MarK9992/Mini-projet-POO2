package model.equipment;

import java.util.ArrayList;

import utils.Period;

public abstract class Equipment {
	private String id;
	private ArrayList<Period> UnavailablePeriod;
	
	public Equipment(String id, ArrayList<Period> unavailablePeriod) {
	    super();
	    this.id = id;
	    UnavailablePeriod = unavailablePeriod;
    }
	
	public String getId() {
    	return id;
    }

	public ArrayList<Period> getUnavailablePeriod() {
    	return UnavailablePeriod;
    }
	public void setUnavailablePeriod(ArrayList<Period> unavailablePeriod) {
    	UnavailablePeriod = unavailablePeriod;
    }
	
}
